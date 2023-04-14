<%-- 
    Document   : View
    Created on : Apr 14, 2023, 3:04:44 PM
    Author     : xarthy
--%>

<%@page import="com.progra.practicaexamen1.logic.Tanda"%>
<%@page import="com.progra.practicaexamen1.presentation.cartelera.Model"%>
<%@page import="java.util.ArrayList"%>
<%
    Model model = (Model) request.getAttribute("model");
    ArrayList<Tanda> cartelera = model.getCartelera();
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="/presentation/Head.jsp" %>
        <title>Cartelera</title>
    </head>
    <body>
        <%@ include file="/presentation/Header.jsp" %>
        <div style=""width:50%;margin:auto;">
            <h1>Testing Cartelera</h1>
        </div>    
        
        <table>
            <thead>
                <tr> <th>Pelicula</th> <th>Hora</th> </tr>
            </thead>
            <tbody>
                <% for (Tanda t:cartelera) {%>
                <tr> <td><%=t.getMovie().getName()%></td>
                    <td><%=t.getTime()%></td></tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>

