<%--
  Created by IntelliJ IDEA.
  User: HeydayKK
  Date: 3/2/2019
  Time: 7:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br><br>

        First name: <form:input path="lastName" />
        <br><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
