<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenacion: <%= "Saludos " + "JSP" %>
        <br>
        Operacion Matemáca: <%= 2*3 /2 %>
        <br>
        Sesion id: <%= session.getId() %>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
