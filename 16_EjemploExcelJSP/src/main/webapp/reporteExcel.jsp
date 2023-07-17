<%@page import="utiles.Conversiones, java.util.Date"%>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String file="informe.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + file);
  %>

<!DOCTYPE html>
<html>
    <head>
        <title>Uso de directivas</title>
    </head>
    <body>
        <h1>Uso de directivas</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Sintaxis básica de Java</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
            <tr>
                <td>2. OOP Java</td>
                <td>Programación Orientada a Objetos</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
