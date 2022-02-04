<%-- 
    Document   : konfirmasi_peminjaman
    Created on : Feb 3, 2022, 4:56:51 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_peminjaman=Integer.parseInt(request.getParameter("id_peminjaman"));
    String status_peminjaman=request.getParameter("konfirmasi");
    
    Peminjaman.setId_peminjaman(id_peminjaman);
    Peminjaman.setStatus_peminjaman(status_peminjaman);

        KalabController.UpdateStatus(Peminjaman);
        response.sendRedirect("daftar_peminjaman.jsp");
%>
