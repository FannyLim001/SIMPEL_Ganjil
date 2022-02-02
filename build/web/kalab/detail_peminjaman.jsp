<%-- 
    Document   : detail_peminjaman
    Created on : Jan 30, 2022, 9:48:01 PM
    Author     : FANNY
--%>

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
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Kepala Lab</a></li>
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Data Peminjaman</a></li>
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
                                                <label class="form-label">Pujiarti</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>NIM Ketua Kegiatan</b></label><br>
                                                <label class="form-label">2055301157</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Kontak Ketua Kegiatan</b></label><br>
                                                <label class="form-label">08123456789</label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <label class="form-label"><b>Lab yang dipinjam</b></label><br>
                                                <label class="form-label">Lab 330</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Level Peminjaman</b></label><br>
                                                <label class="form-label">2</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Peminjaman</b></label><br>
                                                <label class="form-label">13-01-2022</label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Mulai</b></label><br>
                                                <label class="form-label">15-01-2022</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Tanggal Selesai</b></label><br>
                                                <label class="form-label">16-01-2022</label>
                                            </div>
                                            <div class="col-3">
                                                <label class="form-label"><b>Keterangan</b></label><br>
                                                <label class="form-label">Meminjam Lab untuk Pengerjaan Tugas Akhir</label>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
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
                                    <br>
                                    <div class="row">
                                        <div class="col-3">
                                            <a href="kalab_controller" class="btn btn-primary btn-sm"><i class="mdi mdi-clipboard-check-multiple"></i>&nbsp;&nbsp;Setujui</a>&nbsp;&nbsp;
                                            <a href="kalab_controller" class="btn btn-danger btn-sm"><i class="mdi mdi-clipboard-off"></i>&nbsp;&nbsp;Tolak</a>
                                        </div>
                                    </div>
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
