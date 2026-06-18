<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<%
    String mensaje = (String) request.getSession().getAttribute("mensaje");
    if(mensaje!=null){
%>
<!-- HTML -->
<div class="alert alert-success alert-dismissible fade show" role="alert">
    <%=mensaje%>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<% } %>
<main>
    <div class="container">
        <div class="row">
            <div class="col">
                <h1>Bienvenido a Mascotas</h1>
                <a href="persona">Ejemplo persona</a>
                <br>
                <a href="nueva_persona.jsp">Ejemplo registro persona</a>
            </div>
        </div>
    </div>
</main>

<script src="assets/js/bootstrap.js"></script>
</body>


<% request.getSession().removeAttribute("mensaje"); %>
</html>


