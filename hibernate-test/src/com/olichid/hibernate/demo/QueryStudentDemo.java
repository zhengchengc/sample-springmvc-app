package com.olichid.hibernate.demo;

import com.olichid.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // query students
            List<Student> theStudents = session.createQuery("from Student").list();

            //display the students
            displayStudents(theStudents);

            // query students: lastName="Doe"
            theStudents = session.createQuery("from Student s where s.lastName='Doe'").getResultList();

            // display the students
            System.out.println("\n\nStudents who have last name of Doe");
            displayStudents(theStudents);

            // query students: lastName="James" OR "Doe"
            theStudents = session.createQuery("from Student s where" +
                    " s.lastName='James' OR s.firstName'James'").getResultList();

            // display the students
            System.out.println("\n\nStudents who have last name of James or Harden");
            displayStudents(theStudents);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> theStudents) {
        for (Student tempStudent: theStudents) {
            System.out.println(tempStudent);
        }
    }

}
