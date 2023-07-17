<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa formulario</title>
    </head>
    <body>
        <h1>Procesa Formulario</h1>
        usuario: <%= request.getParameter("usuario") %>
        <br>
        password <%=request.getParameter("password")%>
        <br>
         <br>
        <a href="index.html">Volver</a>               
    </body>
</html>
