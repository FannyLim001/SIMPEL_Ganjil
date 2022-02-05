<%-- 
    Document   : olahlogin_kalab
    Created on : Feb 5, 2022, 8:55:28 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<jsp:useBean id="Kalab" class="models.kalab.KalabModel" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String email_kalab=request.getParameter("email_kalab");
    String pass_kalab=request.getParameter("pass_kalab");

    int id_kalab = 1;
    Kalab = KalabController.getDataKalabbyID(id_kalab);
    
        if(email_kalab.equals(Kalab.getEmail_kalab()) && pass_kalab.equals(Kalab.getPass_kalab())){
            session.setAttribute("username", Kalab.getNama_kalab());
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
%>
