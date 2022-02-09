<%-- 
    Document   : laporan_peminjamanXLSX
    Created on : Feb 9, 2022, 1:38:52 PM
    Author     : FANNY
--%>

<%@page import="models.kalab.PeminjamanModel"%>
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "attachment; filename=LaporanPeminjaman.xls");
    
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
    
    PeminjamanModel[] daftarPeminjaman = KalabController.getDaftarPeminjaman();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table id="data_peminjaman" class="table dt-responsive nowrap w-100">
            <thead class="table-light">
                <tr class="text-center">
                    <th>Lab</th>
                    <th>Level</th>
                    <th>Tgl Peminjaman</th>
                    <th>Tgl Mulai</th>
                    <th>Tgl Berakhir</th>
                    <th>Keterangan</th>
                    <th>Ketua Kegiatan</th>
                    <th>Kontak Ketua</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <%  
                    for(int i=0; i<daftarPeminjaman.length; i++){
                    Peminjaman = daftarPeminjaman[i];
                %>
                <jsp:setProperty name = "Peminjaman" property = "no_lab" value = "<%= Peminjaman.getNo_lab()%>" />
                <jsp:setProperty name = "Peminjaman" property = "level" value = "<%= Peminjaman.getLevel()%>" />
                <jsp:setProperty name = "Peminjaman" property = "tgl_peminjaman" value = "<%= Peminjaman.getTgl_peminjaman()%>" />
                <jsp:setProperty name = "Peminjaman" property = "tgl_mulai" value = "<%= Peminjaman.getTgl_mulai()%>" />
                <jsp:setProperty name = "Peminjaman" property = "tgl_berakhir" value = "<%= Peminjaman.getTgl_berakhir()%>" />
                <jsp:setProperty name = "Peminjaman" property = "keterangan" value = "<%= Peminjaman.getKeterangan()%>" />
                <jsp:setProperty name = "Peminjaman" property = "ketua_kegiatan" value = "<%= Peminjaman.getKetua_kegiatan()%>" />
                <jsp:setProperty name = "Peminjaman" property = "kontak_ketua" value = "<%= Peminjaman.getKontak_ketua()%>" />
                <jsp:setProperty name = "Peminjaman" property = "status_peminjaman" value = "<%= Peminjaman.getStatus_peminjaman()%>" />
                <tr>
                    <td><jsp:getProperty name="Peminjaman" property="no_lab" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="level" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="tgl_peminjaman" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="tgl_mulai" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="tgl_berakhir" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="keterangan" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="ketua_kegiatan" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="kontak_ketua" /></td>
                    <td><jsp:getProperty name="Peminjaman" property="status_peminjaman" /></td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>
<% } %>
