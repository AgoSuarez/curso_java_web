<!DOCTYPE html>
<html>
    <head>
        <title>Example MVC 2</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Example MVC 2</div>
        <br>
        <div style="color:red" >
            ${mensaje}
        </div>
        <a href="${pageContext.request.contextPath}/servletController">Servlet Controller sin parametros</a><br>
        <a href="${pageContext.request.contextPath}/servletController?accion=agregarVariables">Servlet Controller con parametros - Agregar</a><br>
        <a href="${pageContext.request.contextPath}/servletController?accion=listarVariables">Servlet Controller con parametros - Listar</a>
    </body>
</html>
