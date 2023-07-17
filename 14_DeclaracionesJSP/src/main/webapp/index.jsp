<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Agregamos una declaración de JSP --%>
<%!
    //Variable con metodo GET -> Se declaran como parte de la clase
    private String usuario = "Alberto";

    public String getUsuario() {
        return this.usuario;
    }

    private int visitas=1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones JSP</title>
    </head>
    <body>
        <h1>Declaraciones JSP</h1>
        valor de usuario por medio del atributo: <%= this.usuario %>
        <br>
        valor de usuario por medio del metodo: <%= this.getUsuario() %>
        <br>       
        Visitas=<%=this.visitas++%>
    </body>
</html>
