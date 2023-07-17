<%-- Por defectos todos los jsp tienen esta directiva en false, una vez activa tenemos acceso al objeto exception --%>
<%@page isErrorPage="true"%>
<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de errores</title>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        Ocurrio una excepcion: <%= exception.getMessage()%>
        <br>
        <textarea rows="30" cols="50">
            <pre>
                <% exception.printStackTrace(new PrintWriter(out));%>
            </pre>
        </textarea>

    </body>
</html>
