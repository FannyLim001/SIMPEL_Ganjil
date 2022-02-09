<%-- 
    Document   : format_laporan
    Created on : Feb 9, 2022, 1:46:45 PM
    Author     : FANNY
--%>

<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String format=request.getParameter("format");
    
    if(format.equals("xlsx")){
        response.sendRedirect("laporan_peminjamanXLSX.jsp");
    } else if(format.equals("pdf")){
        response.sendRedirect("laporan_peminjamanPDF.jsp");
    }
%>
