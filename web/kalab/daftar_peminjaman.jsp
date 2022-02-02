<%-- 
    Document   : daftar_peminjaman
    Created on : Jan 30, 2022, 9:47:36 PM
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
                                                        <tr>
                                                            <td>LAB 330</td>
                                                            <td>1</td>
                                                            <td>2022-01-13 00:00:00</td>
                                                            <td>2022-01-15 00:00:00</td>
                                                            <td>2022-01-16 00:00:00</td>
                                                            <td>Pujiarti</td>
                                                            <td>08123456789</td>
                                                            <td><span class="badge bg-warning p-2">Diajukan</span></td>
                                                            <td><a href="detail_peminjaman.jsp" class="btn btn-primary mb-2"><i class="mdi mdi-information"></i>&nbsp;Detail</a></td>
                                                        </tr>
                                                    </tbody>
                                                </table>                                           
                                            </div> <!-- end preview-->
                                            <div class="tab-pane" id="tab2">
                                                <h5>Peminjaman Selesai</h5> 
                                                <table id="tbl-selesai" class="table dt-responsive nowrap w-100">
                                                    <thead class="table-light">
                                                        <tr class="text-center">
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
                                                        <tr>
                                                            <td>LAB 330</td>
                                                            <td>1</td>
                                                            <td>2022-01-13 00:00:00</td>
                                                            <td>2022-01-15 00:00:00</td>
                                                            <td>2022-01-16 00:00:00</td>
                                                            <td>Pujiarti</td>
                                                            <td>08123456789</td>
                                                            <td><span class="badge bg-success p-2">Disetujui</span></td>
                                                            <td><a href="detail_peminjaman.jsp" class="btn btn-primary mb-2"><i class="mdi mdi-information"></i>&nbsp;Detail</a></td>
                                                        </tr>
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
