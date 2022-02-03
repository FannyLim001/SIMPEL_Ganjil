<%-- 
    Document   : detail_peminjaman
    Created on : Jan 30, 2022, 9:48:01 PM
    Author     : FANNY
--%>

<%@page language="java" %>
<%@page import="models.kalab.PeminjamanModel"%>
<jsp:useBean id="Peminjaman" class="models.kalab.PeminjamanModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<% 
    int id_peminjaman = Integer.parseInt(request.getParameter("id_peminjaman"));
    Peminjaman = KalabController.getDataPeminjamanbyID(id_peminjaman);
    PeminjamanModel[] daftarPeminjaman = KalabController.getDaftarPeminjaman();
%>

<jsp:setProperty name = "Peminjaman" property = "id_peminjaman" value = "<%=Peminjaman.getId_peminjaman()%>" />
<jsp:setProperty name = "Peminjaman" property = "no_lab" value = "<%= Peminjaman.getNo_lab()%>" />
<jsp:setProperty name = "Peminjaman" property = "level" value = "<%= Peminjaman.getLevel()%>" />
<jsp:setProperty name = "Peminjaman" property = "tgl_peminjaman" value = "<%= Peminjaman.getTgl_peminjaman()%>" />
<jsp:setProperty name = "Peminjaman" property = "tgl_mulai" value = "<%= Peminjaman.getTgl_mulai()%>" />
<jsp:setProperty name = "Peminjaman" property = "tgl_berakhir" value = "<%= Peminjaman.getTgl_berakhir()%>" />
<jsp:setProperty name = "Peminjaman" property = "keterangan" value = "<%= Peminjaman.getKeterangan()%>" />
<jsp:setProperty name = "Peminjaman" property = "ketua_kegiatan" value = "<%= Peminjaman.getKetua_kegiatan()%>" />
<jsp:setProperty name = "Peminjaman" property = "nim_mhs" value = "<%= Peminjaman.getNim_mhs()%>" />
<jsp:setProperty name = "Peminjaman" property = "kontak_ketua" value = "<%= Peminjaman.getKontak_ketua()%>" />
<jsp:setProperty name = "Peminjaman" property = "status_peminjaman" value = "<%= Peminjaman.getStatus_peminjaman()%>" />

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
                                            <li class="breadcrumb-item"><a href="daftar_peminjaman.jsp">Data Peminjaman</a></li>
                                            <li class="breadcrumb-item active">Detail Data Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Detail Data Peminjaman</h4>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 

                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h4>Informasi Peminjaman</h4>
                                        <div class="row">
                                            <div class="col-3">
                                                <label class="form-label"><b>Ketua Kegiatan</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="ketua_kegiatan" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>NIM Ketua Kegiatan</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="nim_mhs" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Kontak Ketua Kegiatan</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="kontak_ketua" /></label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <label class="form-label"><b>Lab yang dipinjam</b></label><br>
                                                <label class="form-label">Lab <jsp:getProperty name="Peminjaman" property="no_lab" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Level Peminjaman</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="level" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Peminjaman</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="tgl_peminjaman" /></label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Mulai</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="tgl_mulai" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Selesai</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="tgl_berakhir" /></label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Keterangan</b></label><br>
                                                <label class="form-label"><jsp:getProperty name="Peminjaman" property="keterangan" /></label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
<!--                                        <div class="row">
                                            <div class="col-12">
                                                <label class="form-label"><b>Daftar Mahasiswa</b></label><br>
                                                <div class="row">
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                    <div class="col-2">
                                                        <label class="form-label">Ayu Anita</label>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <br>-->
                                        <form action="konfirmasi_peminjaman.jsp" method="post">
                                            <input type="hidden" name="id_peminjaman" value="<jsp:getProperty name="Peminjaman" property="id_peminjaman" />">
                                            <div class="row">
                                                <div class="col-3">
                                                    <button type="submit" class="btn btn-primary btn-sm" name="konfirmasi" value="Disetujui"><i class="mdi mdi-clipboard-check-multiple"></i>&nbsp;&nbsp;Setujui&nbsp;&nbsp;</button>
                                                    <button type="submit" class="btn btn-danger btn-sm" name="konfirmasi" value="Ditolak"><i class="mdi mdi-clipboard-off"></i>&nbsp;&nbsp;Tolak</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div> <!-- end card -->
                            </div> <!-- end col-->
                        </div>     

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
