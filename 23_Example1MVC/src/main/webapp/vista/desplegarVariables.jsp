

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue Variables </title>
    </head>
    <body>
        <h1>Despliegue Variables </h1>
        <br>
        Variable con alcance request: ${mensaje}
        <br>
        Variable en alcance de sesion -> Rectangulo =
        <!-- Llama al método getBase, getAltura, getArea no a los atributos -->
        <br>
        Base ${rectangulo.base}
        <br>
        Altura ${rectangulo.altura}
        <br>
        Area ${rectangulo.area}
        <br>
        <a href="${pageContext.request.servletContext.contextPath}">Volver</a>
    </body>
</html>
