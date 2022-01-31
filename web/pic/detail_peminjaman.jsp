<%-- 
    Document   : detail_peminjaman
    Created on : Jan 27, 2022, 8:32:49 PM
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="models.pic.Peminjaman"%>
<%@page import="models.pic.InformasiLab"%>
<%@page import="models.pic.Logbook"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Detail Peminjaman | SIMPEL </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />

        <!-- third party css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/buttons.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/select.bootstrap5.css" rel="stylesheet" type="text/css" />
        <!-- third party css end -->

        <!-- Datatables css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/dataTables.bootstrap5.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/vendor/responsive.bootstrap5.css" rel="stylesheet" type="text/css" />
    </head>
    
    <%
        String id_peminjaman = request.getParameter("id_peminjaman");
        
        Peminjaman p = new Peminjaman();
        p = p.peminjamanById(Integer.parseInt(id_peminjaman));
    %>
    
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
                    <%@include file="include/topbar.jsp" %>
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
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">PIC Lab</a></li>
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
                            <div class="col-lg-6">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="header-title mb-3">Informasi Peminjaman</h4>
                                        
                                        <%
                                            if (id_peminjaman == null || id_peminjaman == "") { %>
                                                <p>Tidak ada data</p>
                                            <% } else{
                                        %>
                                        
                                        <ul class="list-unstyled mb-0">
                                            <li>
                                                <p class="mb-2">
                                                    <span class="fw-bold me-2">Ketua Kegiatan:</span>
                                                    <%= p.getKetua_kegiatan() %>
                                                </p>
                                                <p class="mb-3">
                                                    <span class="fw-bold me-2">Kontak Ketua:</span>
                                                    <%= p.getKontak_ketua() %>
                                                </p>
                                                <p class="mb-2">
                                                    <span class="fw-bold me-2">Lab yang dipinjam:</span>
                                                    <%= p.getNo_lab() %>
                                                </p>
                                                <p class="mb-3">
                                                    <span class="fw-bold me-2">Level Peminjaman:</span>
                                                    <%= p.getLevel() %>
                                                </p>
                                                <p class="mb-2">
                                                    <span class="fw-bold me-2">Tanggal Peminjaman:</span>
                                                    <%= p.getTgl_peminjaman() %>
                                                </p>
                                                <p class="mb-2">
                                                    <span class="fw-bold me-2">Tanggal Mulai:</span>
                                                    <%= p.getTgl_mulai() %>
                                                </p>
                                                <p class="mb-3">
                                                    <span class="fw-bold me-2">Tanggal Berakhir:</span>
                                                    <%= p.getTgl_berakhir() %>
                                                </p>
                                                <p class="mb-2">
                                                    <span class="fw-bold me-2">Keterangan:</span>
                                                    <%= p.getKeterangan() %>
                                                </p>
                                                <p class="mb-3">
                                                    <span class="fw-bold me-2">Status:</span>
                                                    <%= p.getStatus_peminjaman() %>
                                                </p>
                                            </li>
                                            <%
                                                }
                                            %>
                                        </ul>
                                        
                                        <%
                                            String status = p.getStatus_peminjaman();
                                            if (!status.equalsIgnoreCase("selesai")) { %>
                                                <div class="text-center">
                                                    <button type="button" class="btn btn-primary" disabled>
                                                        Lihat Logbook
                                                    </button>
                                                </div>  
                                            <% } else{ 
                                                    int id_lab = p.getId_lab();
                                                    String tgl_berakhir = p.getTgl_berakhir();
                                                    Logbook log = new Logbook();
                                                    log = log.logbookByPeminjaman(id_lab, tgl_berakhir);
                                            %>
                                            
                                        <div class="text-center">
                                            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#modalLogbook">
                                                Lihat Logbook
                                            </button>
                                        </div>
                                        
                                        <!-- Modal -->
                                        <div class="modal fade" id="modalLogbook" tabindex="-1" aria-labelledby="modalLogbookLabel" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h5 class="modal-title" id="exampleModalLabel">Data Logbook</h5>
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                    </div>
                                                    <div class="modal-body px-4 pt-4">
                                                        <div class="">
                                                            <img
                                                                src="http://localhost:8080/SIMPEL_Ganjil/assets/images/<%= log.getFoto_lab() %>"
                                                                style="
                                                                    width: 100%;
                                                                    border-radius: 8px;
                                                                "
                                                            >
                                                        </div>
                                                        <ul class="list-unstyled mb-0 mt-3">
                                                            <li>
                                                                <p class="mb-2">
                                                                    <span class="fw-bold me-2">Nama Pengisi:</span>
                                                                    <%= log.getNama_pengisi() %>
                                                                </p>
                                                                <p class="mb-2">
                                                                    <span class="fw-bold me-2">Tanggal Pengisian:</span>
                                                                    <%= log.getTgl_pengisian()%>
                                                                </p>
                                                                <p class="mb-2">
                                                                    <span class="fw-bold me-2">Kondisi Lab:</span>
                                                                    <%= log.getKondisi_lab()%>
                                                                </p>
                                                                <p class="mb-2">
                                                                    <span class="fw-bold me-2">Pengaduan:</span>
                                                                    <%= log.getPengaduan()%>
                                                                </p>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Tutup</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <% } %>
                                    </div>
                                </div>
                            </div> <!-- end col -->
                            
                            <div class="col-lg-6">
                                <div class="card">
                                    <div class="card-body">
                                        <%
                                            InformasiLab info = new InformasiLab();
                                            info = info.labById(id_peminjaman);
                                        %>
                                        <div class="row">
                                            <h4 class="header-title mb-3">Informasi Lab</h4>
                                            <div class="col-lg-6">
                                                <ul class="list-unstyled mb-0">
                                                    <li>
                                                        <p class="mb-2">
                                                            <span class="fw-bold me-2">Nomor Lab:</span>
                                                            <%= info.getNo_lab() %>
                                                        </p>
                                                        <p class="mb-2">
                                                            <span class="fw-bold me-2">Nama Lab:</span>
                                                            <%= info.getNama_lab()%>
                                                        </p>
                                                        <p class="mb-3">
                                                            <span class="fw-bold me-2">Kapasitas Lab:</span>
                                                            <%= info.getKapasitas()%>
                                                        </p>
                                                        <p class="mb-2">
                                                            <span class="fw-bold me-2">Ketua Lab:</span>
                                                            <%= info.getKetua_lab()%>
                                                        </p>
                                                        <p class="mb-2">
                                                            <span class="fw-bold me-2">PIC Lab:</span>
                                                            <%= info.getPic_lab()%>
                                                        </p>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-lg-6">
                                                <img 
                                                    class="mt-1"
                                                    src="http://localhost:8080/SIMPEL_Ganjil/assets/images/<%= info.getFoto_lab() %>"
                                                    style="
                                                        width: 100%;
                                                        border-radius: 8px;
                                                    "
                                                >
                                            </div>
                                        </div>
                                                     
                                    </div>
                                </div>
                            </div> <!-- end col -->
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


        <!-- bundle -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js"></script>

        <!-- third party js -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery.dataTables.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.bootstrap5.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.responsive.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/responsive.bootstrap5.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.buttons.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.bootstrap5.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.html5.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.flash.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/buttons.print.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.keyTable.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/dataTables.select.min.js"></script>
        <!-- third party js ends -->

        <!-- demo app -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js"></script>
        <!-- end demo js-->

    </body>
</html>
