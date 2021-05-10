
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>



<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title>${student.id}</title>
    <link rel="stylesheet"
          href="https://bootswatch.com/4/superhero/bootstrap.min.css"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous" async></script>

</head>
<body>
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

<table class="table" frame="border" rules="all">
    <tr><td>Name:</td><td>${student.name}</td></tr>
    <tr><td>Birth date:</td><td>${student.birth_date}</td></tr>
    <tr><td>Neptun code:</td><td>${student.id}</td></tr>
    <tr><td>Department:</td><td>${student.department}</td></tr>
    <tr><td>Passed semesters:</td><td>${student.passed_semesters}</td></tr>
    <tr><td>Language knowledge:</td><td>${student.languageKnowledge}</td></tr>
</table>
</body>
</html>
