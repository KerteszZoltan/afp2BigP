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
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Logo</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${pageContext.servletContext.contextPath}/">Főoldal</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="${pageContext.servletContext.contextPath}/students">Tanulók</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Szűrés szakok szerint
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="${pageContext.servletContext.contextPath}/listByDep">CS tanulók</a></li>
                        <li><a class="dropdown-item" href="${pageContext.servletContext.contextPath}/listByDepBI">BI tanulók</a></li>
                        <li><a class="dropdown-item" href="${pageContext.servletContext.contextPath}/listByDepTM">TM tanulók</a></li>
                        <li><a class="dropdown-item" href="${pageContext.servletContext.contextPath}/listByDepITL">ITL tanulók</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
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