<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL Variables implicitas</title>
    </head>
    <body>
        <h1>EL Variables implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion ${pageContext.request.contextPath}</li>          
            <li>Variable usuario: ${pageContext.request.getParameter("usuario")}</li>
            <li>Variable usuario: ${param["usuario"]}</li>
            <li>Navegador cliente: ${header["User-Agent"]}</li>
            <li>ID de session: ${cookie.JSESSIONID.value} Longitud ${cookie.JSESSIONID.value.length()}</li>
            <li>WebServer: ${pageContext.servletContext.serverInfo}</<li>
        </ul>
        <br>
        <a href="index.jsp">volver</a>
    </body>
</html>
