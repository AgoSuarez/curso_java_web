<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <br>
        <!-- Manipulación de variables -->
        <c:set var="nombre" value="Ernesto" />
        Valor nombre: <c:out value="${nombre}"/>
        <br>
        <!-- escapeXml se pone en false para que interprete las etiquetas de HTML -->
        variable con codigo HTML <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <!-- Uso de IF -->
        <c:set var="flag" value="true"/>
        <c:if test="${flag}" >
            La bandera es verdadera
        </c:if>                
        <br>
         <!-- Uso de CHOOSE - switch -->
        <c:if  test="${param.opcion != null}">
        <c:choose>
            <c:when test="${param.opcion == 1}">
                Opcion seleccionada = 1
            </c:when>
             <c:when test="${param.opcion == 2}">
                Opcion seleccionada = 2
            </c:when>
             <c:otherwise>
                Opcion seleccionada = No válida (${param.opcion})
                </c:otherwise>
        </c:choose>
        </c:if>
         <br>
         <% 
            String nombres[] = {"Claudia", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
         %>
         <ul>
             <c:forEach var="persona" items="${nombres}">
                 <li>
                     Nombre: ${persona}
                 </li>
             </c:forEach>
         </ul>
                
        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
