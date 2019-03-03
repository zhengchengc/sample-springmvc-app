package com.olichid.hibernate.demo;

import com.olichid.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create 3 students objects
            System.out.println("Creating 3 students objects...");
            Student tempStudent1 = new Student("James", "Harden", "james@olichid.com");
            Student tempStudent2 = new Student("LeBron", "James", "lebron@olichid.com");
            Student tempStudent3 = new Student("Paul", "George", "paulg@olichid.com");

            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the student...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }
}
