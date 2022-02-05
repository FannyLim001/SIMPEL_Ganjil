<%-- 
    Document   : logout
    Created on : Feb 5, 2022, 9:46:10 PM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.invalidate();
    response.sendRedirect("login.jsp");
%>
