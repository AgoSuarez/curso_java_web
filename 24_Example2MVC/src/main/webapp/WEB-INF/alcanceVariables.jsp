<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Variables</title>
    </head>
    <body>
        <h1>Listar Variables</h1>
        <br>
        Variable alcance request: <br>
        Base: ${rectanguloRequest.base}<br>
        Altura: ${rectanguloRequest.altura}<br>
        Area: ${rectanguloRequest.area}<br>
        Variable alcance Session<br>
        Base: ${rectanguloSesion.base}<br>
        Altura: ${rectanguloSesion.altura}<br>
        Area:${rectanguloSesion.area}<br>
        Variable alcance Aplicacion<br>
        Base: ${rectanguloAplicacion.base}<br>
        Altura: ${rectanguloAplicacion.altura}<br>
        Area:${rectanguloAplicacion.area}<br>
        <a href="${pageContext.request.contextPath}">Volver</a>
    </body>
</html>
