<%-- 
    Document   : olahedit_pic
    Created on : Feb 3, 2022, 9:55:43 PM
    Author     : FANNY
--%>

<jsp:useBean id="Pic" class="models.kalab.PicModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_pic=Integer.parseInt(request.getParameter("id_pic"));
    String nama_pic=request.getParameter("nama_pic");
    String ruangan_pic=request.getParameter("ruangan_pic");
    String email_pic=request.getParameter("email_pic");
    String pass_pic=request.getParameter("pass_pic");
    String kontak_pic=request.getParameter("kontak_pic");
    
    Pic.setId_pic(id_pic);
    Pic.setNama_pic(nama_pic);
    Pic.setRuangan_pic(ruangan_pic);
    Pic.setEmail_pic(email_pic);
    Pic.setPass_pic(pass_pic);
    Pic.setKontak_pic(kontak_pic);

        KalabController.UpdatePic(Pic);
        response.sendRedirect("data_pic.jsp");
%>
