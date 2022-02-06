<%-- 
    Document   : hapus_lab
    Created on : Feb 6, 2022, 6:55:22 PM
    Author     : andre
--%>

<jsp:useBean id="PicController" class="controllers.pic.PicController" />
<jsp:useBean id="Lab" class="models.pic.InformasiLab" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_lab = Integer.parseInt(request.getParameter("id_lab"));
    Lab.setId_lab(id_lab);
    PicController.hapusDataLab(Lab);
    response.sendRedirect("daftar_lab.jsp");
%>

