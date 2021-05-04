<%@ page isELIgnored="false"%>
<html>
<head>
    <link rel="stylesheet"
          href="https://bootswatch.com/4/superhero/bootstrap.min.css"/>
</head>
<body>
<h2 class="text-center">Hello World!</h2>
<div class="container">
<form class="form-input col-6" action="${pageContext.servletContext.contextPath}/students">
    <input class="btn-primary" type="submit" value="Students">
</form>
</div>
</body>
</html>
