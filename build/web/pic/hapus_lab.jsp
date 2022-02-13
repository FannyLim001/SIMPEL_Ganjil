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
    int delete = PicController.hapusDataLab(Lab);
    if (delete > 0) {
        request.setAttribute("proses_lab", "berhasil");
    }else{
        request.setAttribute("proses_lab", "gagal");
    }
    request.getRequestDispatcher("/pic/daftar_lab.jsp").forward(request, response);
%>

