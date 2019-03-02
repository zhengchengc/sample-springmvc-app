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

        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br><br>

        Favorite Language:
        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br><br>

        Operating Systems:
        Linux <form:checkbox path="operatingSystem" value="Linux" />
        macOS <form:checkbox path="operatingSystem" value="macOS" />
        MS Windows <form:checkbox path="operatingSystem" value="MS Windows" />


        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
