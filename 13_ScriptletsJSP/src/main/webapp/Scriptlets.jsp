<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlets JSP</title>
    </head>
    <body>
        <h1>Scriptlets JSP</h1>
        <br>
        <%-- Comentario de JSP que no se muestra en el navegador --%>
        <%
            out.print("Saludos desde un Scriptlets");
        %>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print(nombreAplicacion + "<br>");
        %>
        <%
            if (session != null && session.isNew()) {
        %>
        La sesión es nueva
        <%
        } else if (session != null) {
        %>
        La sesión NO es nueva
        <% }%>
        <br>
        <a href="index.html">Volver</a>            
    </body>
</html>
