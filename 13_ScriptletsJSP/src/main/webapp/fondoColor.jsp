<%
    String color = request.getParameter("color");
    if (color == null || color.trim().equals("")) {
        color = "white";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio Color</title>
    </head>
    <body bgcolor="<%=color%>">
        <h1>JSP Cambio Color</h1>
        <br>
        Color de fondo aplicado = <%=color%>
        <br>
        <a href="index.html">Volver</a>

    </body>
</html>
