<%-- 
    Document   : daftar_peminjaman
    Created on : Jan 30, 2022, 9:47:36 PM
    Author     : FANNY
--%>

<%@page language="java" %>
<%@page import="models.kalab.PeminjamanModel"%>
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<% 
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
    
    PeminjamanModel[] daftarPeminjaman = KalabController.getDaftarPeminjamanBelumSelesai();
    PeminjamanModel[] daftarPeminjaman2 = KalabController.getDaftarPeminjamanSelesai();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Data Peminjaman | SIMPEL</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
    </head>

    <body class="loading" data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
        <!-- Begin page -->
        <div class="wrapper">
            <!-- Sidebar Start -->
            <%@include file="include/sidebar.jsp" %>
            <!-- end Sidebar -->

            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">

                    <!-- Topbar Start -->
                    <%@include file="include/header.jsp" %>
                    <!-- end Topbar -->

                    <!-- Start Content-->
                    <div class="container-fluid">

                        <!-- start page title -->
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    <div class="page-title-right">
                                        <ol class="breadcrumb m-0">
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">SIMPEL</a></li>
                                            <li class="breadcrumb-item"><a href="dashboard.jsp">Kepala Lab</a></li>
                                            <li class="breadcrumb-item active">Daftar Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Daftar Peminjaman</h4>
                                </div>
                            </div>
                        </div>

                        <!-- end page title --> 
                        <div class="row">
                            <div class="col-3">
                                <ul class="nav nav-pills bg-nav-pills nav-justified mb-3">
                                    <li class="nav-item">
                                        <a href="#tab1" data-bs-toggle="tab" aria-expanded="false" class="nav-link rounded-0 active">
                                            <i class="mdi mdi-home-variant d-md-none d-block"></i>
                                            <span class="d-none d-md-block">Dalam Proses</span>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#tab2" data-bs-toggle="tab" aria-expanded="true" class="nav-link rounded-0">
                                            <i class="mdi mdi-account-circle d-md-none d-block"></i>
                                            <span class="d-none d-md-block">Selesai</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="tab-content">
                                            <div class="tab-pane show active" id="tab1">
                                                <h5>Peminjaman Proses</h5>
                                                <table id="tbl-proses" class="table dt-responsive nowrap w-100">
                                                    <thead class="table-light">
                                                        <tr class="text-center">
                                                            <th>No</th>
                                                            <th>Lab</th>
                                                            <th>Level</th>
                                                            <th>Tgl Peminjaman</th>
                                                            <th>Tgl Mulai</th>
                                                            <th>Tgl Berakhir</th>
                                                            <th>Ketua Kegiatan</th>
                                                            <th>Kontak Ketua</th>
                                                            <th>Status</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%  
                                                            int num=1;
                                                            for(int i=0; i<daftarPeminjaman.length; i++){
                                                            Peminjaman = daftarPeminjaman[i];
                                                        %>
                                                        <jsp:setProperty name = "Peminjaman" property = "id_peminjaman" value = "<%=Peminjaman.getId_peminjaman()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "no_lab" value = "<%= Peminjaman.getNo_lab()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "level" value = "<%= Peminjaman.getLevel()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_peminjaman" value = "<%= Peminjaman.getTgl_peminjaman()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_mulai" value = "<%= Peminjaman.getTgl_mulai()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_berakhir" value = "<%= Peminjaman.getTgl_berakhir()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "ketua_kegiatan" value = "<%= Peminjaman.getKetua_kegiatan()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "kontak_ketua" value = "<%= Peminjaman.getKontak_ketua()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "status_peminjaman" value = "<%= Peminjaman.getStatus_peminjaman()%>" />
                                                        <tr>
                                                            <td><%=num++%></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="no_lab" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="level" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_peminjaman" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_mulai" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_berakhir" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="ketua_kegiatan" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="kontak_ketua" /></td>
                                                            <%
                                                                String status = Peminjaman.getStatus_peminjaman();
                                                                if (status.equals("Menunggu")) { %>
                                                                <td><span class="badge bg-secondary p-2"><%= status %></span></td>
                                                                <% }
                                                            %>
                                                            <td><a href="detail_peminjaman.jsp?id_peminjaman=<jsp:getProperty name="Peminjaman" property="id_peminjaman" />" class="btn btn-primary mb-2"><i class="mdi mdi-information"></i>&nbsp;Detail</a></td>
                                                        </tr>
                                                        <%}%>
                                                    </tbody>
                                                </table>
                                            </div> <!-- end preview-->
                                            <div class="tab-pane" id="tab2">
                                                <h5>Peminjaman Selesai</h5> 
                                                <table id="tbl-selesai" class="table dt-responsive nowrap w-100">
                                                    <thead class="table-light">
                                                        <tr class="text-center">
                                                            <th>No</th>
                                                            <th>Lab</th>
                                                            <th>Level</th>
                                                            <th>Tgl Peminjaman</th>
                                                            <th>Tgl Mulai</th>
                                                            <th>Tgl Berakhir</th>
                                                            <th>Ketua Kegiatan</th>
                                                            <th>Kontak Ketua</th>
                                                            <th>Status</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            int num2=1;
                                                            for(int i=0; i<daftarPeminjaman2.length; i++){
                                                            Peminjaman = daftarPeminjaman2[i];
                                                        %>
                                                        <jsp:setProperty name = "Peminjaman" property = "id_peminjaman" value = "<%=Peminjaman.getId_peminjaman()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "no_lab" value = "<%= Peminjaman.getNo_lab()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "level" value = "<%= Peminjaman.getLevel()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_peminjaman" value = "<%= Peminjaman.getTgl_peminjaman()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_mulai" value = "<%= Peminjaman.getTgl_mulai()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "tgl_berakhir" value = "<%= Peminjaman.getTgl_berakhir()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "ketua_kegiatan" value = "<%= Peminjaman.getKetua_kegiatan()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "kontak_ketua" value = "<%= Peminjaman.getKontak_ketua()%>" />
                                                        <jsp:setProperty name = "Peminjaman" property = "status_peminjaman" value = "<%= Peminjaman.getStatus_peminjaman()%>" />
                                                        <tr>
                                                            <td><%=num2++%></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="no_lab" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="level" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_peminjaman" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_mulai" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="tgl_berakhir" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="ketua_kegiatan" /></td>
                                                            <td><jsp:getProperty name="Peminjaman" property="kontak_ketua" /></td>
                                                            <%
                                                                String status = Peminjaman.getStatus_peminjaman();
                                                                if (status.equals("Disetujui")) { %>
                                                                <td><span class="badge bg-info p-2"><%= status %></span></td>
                                                                <% } else if (status.equals("Ditolak")) { %>
                                                                <td><span class="badge bg-danger p-2"><%= status %></span></td> 
                                                                <% } else if (status.equals("Dibatalkan")) { %>
                                                                <td><span class="badge bg-danger p-2"><%= status %></span></td> 
                                                                <% } else if (status.equals("Selesai")) { %>
                                                                <td><span class="badge bg-success p-2"><%= status %></span></td>   
                                                                <% }
                                                            %>
                                                            <td><a href="detail_peminjaman.jsp?id_peminjaman=<jsp:getProperty name="Peminjaman" property="id_peminjaman" />" class="btn btn-primary mb-2"><i class="mdi mdi-information"></i>&nbsp;Detail</a></td>
                                                        </tr>
                                                        <%}%>
                                                    </tbody>
                                                </table>                                           
                                            </div> <!-- end preview-->
                                        </div> <!-- end card body-->
                                    </div> <!-- end card -->
                                </div><!-- end col-->
                            </div>
                            <!-- end row -->        
                        </div> <!-- container -->
                    </div> <!-- content -->

                    <!-- Footer Start -->
                    <%@include file="include/footer.jsp" %>
                    <!-- end Footer -->

                </div>

                <!-- ============================================================== -->
                <!-- End Page content -->
                <!-- ============================================================== -->


            </div>
            <!-- END wrapper -->

            <div class="rightbar-overlay"></div>
            <!-- /End-bar -->
    </body>
</html>
<% } %>
