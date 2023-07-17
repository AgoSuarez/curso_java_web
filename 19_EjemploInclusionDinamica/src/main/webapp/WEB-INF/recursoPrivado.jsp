<!DOCTYPE html>
<%
    String color=request.getParameter("colorFondo");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='<%=color%>'>
        <h1>Inclusión JSP Privada</h1>
    </body>
</html>
