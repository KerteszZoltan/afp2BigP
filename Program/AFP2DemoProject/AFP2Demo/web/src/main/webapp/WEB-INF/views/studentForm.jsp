
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="https://bootswatch.com/4/superhero/bootstrap.min.css"/>
</head>
<body>
<form:form method="post" action="addStudent" modelAttribute="student">
    <form:label path="name">Name</form:label>
        <form:input path="name"/>
    <form:label path="id">_Neptun code</form:label>
        <form:input path="id"/>
    <form:label path="birth_date">Birth date</form:label>
        <form:input type="date" path="birth_date"/>
    <form:label path="passed_semesters">Passed semesters</form:label>
        <form:input path="passed_semesters"/>
    <form:label path="department">Department</form:label>
        <form:select path="department">
            <form:options items="${department}"></form:options>
        </form:select>
    <input type="submit" value="Submit"/>


</form:form>


</body>
</html>
