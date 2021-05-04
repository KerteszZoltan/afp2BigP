
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet"
          href="https://bootswatch.com/4/superhero/bootstrap.min.css"/>
</head>
<body>
<c:if test="${!empty students}">
    <table frame="border" rules="all">
        <tr><th>Neptun code</th><th>Name</th><th>Birth date</th></tr>
    <c:forEach items="${students}" var="stud">
        <tr><td><a href="${pageContext.servletContext.contextPath}/student/${stud.id}">${stud.id}</a></td><td>${stud.name}</td><td>${stud.birth_date}</td></tr>
    </c:forEach>
        </table>
</c:if>
<c:if test="${empty students}">
    <c:out value="There are no students in the database"/></c:if>

<form action="${pageContext.servletContext.contextPath}/">
    <input type="submit" value="Home">
</form>
<form action="${pageContext.servletContext.contextPath}/addStudent">
    <input type="submit" value="addStudent">
</form>

</body>
</html>
