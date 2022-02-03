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
    
    Peminjaman.setStatus_peminjaman(status_peminjaman);

        int status = KalabController.update(Peminjaman);
        if(status>0){
            out.print("<p>Record updated successfully!</p>");
            request.getRequestDispatcher("daftar_peminjaman.jsp").include(request,response);
        }else{
            out.println("Sorry! unable to update record");
        }
        out.close();
%>
