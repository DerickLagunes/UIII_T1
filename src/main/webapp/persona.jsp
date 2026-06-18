<%@ page import="mx.edu.utez.mascota.model.Persona" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <main>
        <% Persona p1 = (Persona) request.getAttribute("persona"); %>
        <h1>Bienvenido: <%= p1.getNombre() + " " + p1.getApellido() %></h1>
        <img src="<%=p1.getFoto()%>" width="200"/>
        <a href="index.jsp">regresar</a>
    </main>
</body>
</html>