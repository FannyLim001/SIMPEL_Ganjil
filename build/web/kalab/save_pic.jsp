<%-- 
    Document   : save_pic
    Created on : Feb 4, 2022, 10:26:56 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<jsp:useBean id="Pic" class="models.kalab.PicModel" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nama_pic=request.getParameter("nama_pic");
    String ruangan_pic=request.getParameter("ruangan_pic");
    String email_pic=request.getParameter("email_pic");
    String pass_pic=request.getParameter("pass_pic");
    String kontak_pic=request.getParameter("kontak_pic");
    
    Pic.setNama_pic(nama_pic);
    Pic.setRuangan_pic(ruangan_pic);
    Pic.setEmail_pic(email_pic);
    Pic.setPass_pic(pass_pic);
    Pic.setKontak_pic(kontak_pic);

        KalabController.SavePic(Pic);
        response.sendRedirect("data_pic.jsp");
%>
