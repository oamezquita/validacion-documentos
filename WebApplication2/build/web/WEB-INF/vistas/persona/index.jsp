<%-- 
    Document   : index
    Created on : 22/09/2013, 12:03:24 PM
    Author     : OscarF
--%>

<%@page import="modelos.PersonaM"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%   PersonaM empleado= (PersonaM)request.getAttribute("w"); %>
        <%=empleado %>
        <br>opciones:</br>
    <%for (int i=0;i<empleado.opciones.length; i++) {%>
    <% String x=""+empleado.opciones[i]; %>
<li><%=x %></li>
    <% } %>
    </body>
</html>
