<%-- 
    Document   : laporan_peminjaman
    Created on : Jan 30, 2022, 9:47:16 PM
    Author     : FANNY
--%>


<%
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Laporan Peminjaman | SIMPEL</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
    </head>
    <body class="loading" data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
        <!-- Begin page -->
        <div class="wrapper">
            <%@include file="include/sidebar.jsp" %>
            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">
                    <%@include file="include/header.jsp" %>

                    <!-- Start Content-->
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    <div class="page-title-right">
                                        <ol class="breadcrumb m-0">
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">SIMPEL</a></li>
                                            <li class="breadcrumb-item"><a href="dashboard.jsp">Kepala Lab</a></li>
                                            <li class="breadcrumb-item active">Laporan Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Laporan Peminjaman SIMPEL</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-lg-10">
                                                <h4>Data Peminjaman Lab</h4>
                                            </div>
                                            <div class="col-lg-2 text-right">
                                                <a href="print_laporan.jsp" class="btn btn-primary btn-sm"><i class="mdi mdi-printer"></i>&nbsp;&nbsp;Cetak</a>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-xl-3">
                                                <h4>Tampilkan berdasarkan</h4>
                                                <div class="dropdown">
                                                    <button class="btn btn-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                        Nomor Lab
                                                    </button>
                                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                                        <a class="dropdown-item" href="#">Nama Lab</a>
                                                        <a class="dropdown-item" href="#">Level</a>
                                                        <a class="dropdown-item" href="#">Tahun Peminjaman</a>
                                                        <a class="dropdown-item" href="#">Status Peminjaman</a>
                                                    </div>
                                                </div>
                                                <br>
                                                <h4>PIC Lab</h4>
                                                <div class="dropdown">
                                                    <button class="btn btn-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                        Dwi Listiyanti
                                                    </button>
                                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                                        <a class="dropdown-item" href="#">Susiyanti</a>
                                                        <a class="dropdown-item" href="#">Aida Kamila</a>
                                                        <a class="dropdown-item" href="#">Harumin</a>
                                                    </div>
                                                </div>
                                            </div><!-- end col-->

                                            <div class="col-xl-9">
                                                <div dir="ltr">
                                                    <div class="mt-3 chartjs-chart" style="height: 320px;">
                                                        <canvas id="bar-chart-example" data-colors="#fa5c7c,#727cf5"></canvas>
                                                    </div>
                                                </div>
                                            </div><!-- end col-->
                                        </div>
                                        <!-- end row-->
                                    </div>
                                </div> <!-- end card -->
                            </div> <!-- end col-->        
                        </div> <!-- end row -->

                    </div> <!-- container -->

                </div> <!-- content -->
                <%@include file="include/footer.jsp" %>

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