<%-- 
    Document   : olahlogin_kalab
    Created on : Feb 5, 2022, 8:55:28 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<jsp:useBean id="Kalab" class="models.kalab.KalabModel" />
<%@page import="java.sql.*"%>
<%@page import="models.kalab.KalabModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String email_kalab=request.getParameter("email_kalab");
    String pass_kalab=request.getParameter("pass_kalab");
    
    Kalab.setEmail_kalab(email_kalab);
    Kalab.setPass_kalab(pass_kalab);
    
    boolean status = KalabController.CekLogin(Kalab);
        if(status){
            session.setAttribute("id", Kalab.getId_kalab());
            session.setAttribute("username", Kalab.getNama_kalab());
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
%>
