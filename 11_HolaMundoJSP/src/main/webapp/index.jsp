<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Se puede obviar porque esta la directiva @page <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <title>Hola Mundo</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <li> <% out.print("Hola mundo con Scriptles"); %> </li>
            <li>${"Hola Mundo con expression Language (EL) "} </li>
            <li><%= "Hola mundo con expresiones" %></li>
            <li><c:out value="Hola Mundo con jstl"/></li>
        </ul>
    </body>
</html>
