<%-- 
    Document   : salida
    Created on : 06-oct-2020, 8:52:20
    Author     : facu_
--%>
<%@page import="com.emergentes.modelo.Rectangulo"%>
<%
    Rectangulo miobj=(Rectangulo) request.getAttribute("miobj");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Area dek rectangulo</h1>
        <p>El area del rectangulo es:<%= miobj.getArea() %></p>
        <a href="index.jsp">Volver</a>
    </body>
</html>
