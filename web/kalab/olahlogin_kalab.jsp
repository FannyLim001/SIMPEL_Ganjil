<%-- 
    Document   : olahlogin_kalab
    Created on : Feb 5, 2022, 8:55:28 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%@page import="java.sql.*"%>
<%@page import="models.kalab.KalabModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String email_kalab=request.getParameter("email_kalab");
    String pass_kalab=request.getParameter("pass_kalab");

    KalabModel [] daftarKalab = KalabController.getDaftarKalab();
    
    for(int i=0; i<=daftarKalab.length; i++){
        if(email_kalab.equals(daftarKalab[i].getEmail_kalab()) && pass_kalab.equals(daftarKalab[i].getPass_kalab())){
            session.setAttribute("username", daftarKalab[i].getNama_kalab());
            session.setAttribute("login", "Berhasil");
            request.getRequestDispatcher("dashboard.jsp").include(request, response);
        } else {
            session.setAttribute("login", "Gagal");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
    }
%>
