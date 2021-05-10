<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet"
          href="https://bootswatch.com/4/superhero/bootstrap.min.css"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"
            async>
    </script>
    <title>Frissítés</title>
</head>
<body style="text-align: center", topmargin="100px">
<h3>Update student</h3>
<form:form method="post" action="updateStudent" modelAttribute="student">
    <form:label path="id">Neptun code</form:label> <br>
        <form:input path="id"/> <br><br>
    <form:label path="name">Name</form:label><br>
        <form:input path="name"/><br><br>
    <form:label path="birth_date">Birth date</form:label><br>
        <form:input type="date" path="birth_date"/><br><br>
    <form:label path="passed_semesters">Passed semesters</form:label><br>
        <form:input path="passed_semesters"/><br><br>
    <form:label path="department">Department</form:label><br>
        <form:select path="department"><br><br>
            <form:options items="${department}"></form:options>
        </form:select><br><br>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>