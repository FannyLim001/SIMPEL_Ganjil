<%-- 
    Document   : LogoutPic
    Created on : Feb 4, 2022, 8:45:56 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
    response.sendRedirect("login_pic.jsp");
%>
