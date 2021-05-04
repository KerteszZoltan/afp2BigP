
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>${student.id}</title>
</head>
<body>
<table>
    <tr><td>Name:</td><td>${student.name}</td></tr>
    <tr><td>Birth date:</td><td>${student.birth_date}</td></tr>
    <tr><td>Neptun code:</td><td>${student.id}</td></tr>
    <tr><td>Department:</td><td>${student.department}</td></tr>
    <tr><td>Passed semesters:</td><td>${student.passed_semesters}</td></tr>
    <tr><td>Language knowledge:</td><td>${student.languageKnowledge}</td></tr>
</table>
<form action="${pageContext.servletContext.contextPath}/">
    <input type="submit" value="Home">
</form>
</body>
</html>
