<%-- 
    Document   : ola
    Created on : 14/08/2019, 21:37:15
    Author     : 17214290001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diga Olá</title>
    </head>
    <body>
        <%
            String nome = request.getParameter("nome");
            if (nome == null || nome.isEmpty()) {
        %>
        <h1>Olá Mundo!</h1>
        <%
        } else {
        %>
        <h1>Olá <%=nome%>!</h1>
        <%
            }
        %>
        <%java.util.Date data = new java.util.Date();%> 
        <%=data%>
        <p>Você está acessando uma página JSP.</p>
    </body>
</html>
