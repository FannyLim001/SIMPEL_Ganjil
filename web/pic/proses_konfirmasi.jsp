<%@page import="models.pic.Konfirmasi_peminjaman"%>

<%
    Konfirmasi_peminjaman km = new Konfirmasi_peminjaman();
    int id = Integer.parseInt(request.getParameter("id"));
    String status = request.getParameter("status");
    km.proses(id, status);
%>