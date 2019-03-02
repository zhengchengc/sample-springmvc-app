<%--
  Created by IntelliJ IDEA.
  User: HeydayKK
  Date: 3/2/2019
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
    <title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Free passes: ${customer.freePasses}

<br><br>

Postal Code: ${customer.postalCode}

<br><br>

Course Code: ${customer.courseCode}

</body>

</html>











