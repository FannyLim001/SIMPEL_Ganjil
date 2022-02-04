<%-- 
    Document   : beranda.jsp
    Created on : Jan 26, 2022, 2:48:55 PM
    Author     : SHOLAWATI
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<!-- Models -->
<!-- Models -->
<%@page import="models.pic.Peminjaman"%>
<%@page import="models.pic.Konfirmasi_peminjaman"%>
<%@page import="models.pic.InformasiLab"%>

<!-- Controllers -->
<%@page import="controllers.pic.PicController"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Konfirmasi Peminjaman | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Konfirmasi Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Konfirmasi Peminjaman</h4>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 
                        
                        <!-- Start dasboard stuff -->
                        <div class="row">
                            <%
                                Peminjaman[] p = new PicController().getStatusPeminjaman();
                                String bgcard = null; 
                                String stat = null;
                                for (int i = 0; i < p.length; i++) {
                                    stat = p[i].getStatus_peminjaman();
                                    if (stat.equals("Diajukan")) {
                                        bgcard = "bg-warning";
                                    }else if (stat.equals("Menunggu")) {
                                        bgcard = "bg-secondary";
                                    }else if (stat.equals("Disetujui")) {
                                        bgcard = "bg-info";
                                    }else if (stat.equals("Ditolak")) {
                                        bgcard = "bg-danger";
                                    }else if (stat.equals("Selesai")) {
                                        bgcard = "bg-success";
                                    }
                            %>
                            <div class="col-md-2">
                                <div class="card text-light <%= bgcard %>">
                                    <div class="card-body d-flex flex-column align-items-center">
                                        <h1 class="mt-1 mb-1">
                                            <%= p[i].getJml_status_peminjaman() %>
                                        </h1>
                                        <p class="fw-normal mb-0">Peminjaman</p>
                                        <h4 class="fw-bold mt-0 mb-1 text-center">
                                            <%= stat %>
                                        </h4>                                        
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div> <!-- end col-->
                            <%
                                }
                                InformasiLab info = new PicController().getLabTersedia();
                            %>
                            <div class="col-md-2">
                                <div class="card">
                                    <div class="card-body d-flex flex-column align-items-center">
                                            <h1 class="mt-1 mb-1 d-inline">
                                                <%= info.getLab_tersedia() %> / 
                                                <%= info.getJml_lab() %> 
                                            </h1>
                                        <p class="fw-normal mb-0">Lab Yang</p>
                                        <h4 class="fw-bold mt-0 mb-1 text-center">
                                            Tersedia
                                        </h4>                                        
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div>
                        </div>
                        <!-- end row -->
                        
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="tab-content">
                                            <div class="tab-pane show active" id="basic-datatable-preview">
                                                <h5>Peminjaman Yang Diajukan</h5>
                                                <table id="tbl-proses" class="table display nowrap">
                                                    <thead class="table-light">
                                                        <tr class="text-center">
                                                            <th>Lab</th>
                                                            <th>Ketua Kegiatan</th>
                                                            <th>Kontak Ketua</th>
                                                            <th>Level</th>
                                                            <th>Tgl Peminjaman</th>
                                                            <th>Tgl Mulai</th>
                                                            <th>Tgl Berakhir</th>
                                                            <th>Keterangan</th>
                                                            <th>Status</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            Peminjaman[] peminjaman = new PicController().getPeminjamanDiajukan();
                                                            for (int i = 0; i < peminjaman.length; i++) {
                                                        %>
                                                        <tr>
                                                            <td><%= peminjaman[i].getNo_lab() %></td>
                                                            <td><%= peminjaman[i].getKetua_kegiatan() %></td>
                                                            <td class="text-center"><%= peminjaman[i].getKontak_ketua() %></td>
                                                            <td class="text-center"><%= peminjaman[i].getLevel() %></td>
                                                            <td class="text-center"><%= peminjaman[i].getTgl_peminjaman() %></td>
                                                            <td class="text-center"><%= peminjaman[i].getTgl_mulai() %></td>
                                                            <td class="text-center"><%= peminjaman[i].getTgl_berakhir() %></td>
                                                            <td><%= peminjaman[i].getKeterangan() %></td>
                                                            <td class="text-center">
                                                                <%
                                                                    String status = peminjaman[i].getStatus_peminjaman();
                                                                    if (status.equalsIgnoreCase("diajukan")) { %>
                                                                <span class="badge bg-warning p-2"><%= status %></span>
                                                                <%
                                                                    }else if (status.equalsIgnoreCase("menunggu")){ %>
                                                                <span class="badge bg-secondary p-2"><%= status %></span>
                                                                <%
                                                                    }else if (status.equalsIgnoreCase("ditolak")){ %>
                                                                <span class="badge bg-danger p-2"><%= status %></span>
                                                                <%    
                                                                     }else if (status.equalsIgnoreCase("disetujui")){ %>
                                                                <span class="badge bg-success p-2"><%= status %></span>
                                                                <%    
                                                                    }
                                                                %>
                                                            </td>
                                                            <td class="text-center">
                                                                <% if(status.equalsIgnoreCase("disetujui") || status.equalsIgnoreCase("ditolak")){
                                                                    System.out.println("-");
                                                                }else{
                                                                %>
                                                                <a href="proses_konfirmasi.jsp?id=<%= peminjaman[i].getId_peminjaman() %>&aksi=Disetujui" class="btn btn-success btn-sm">
                                                                    Setujui
                                                                </a>
                                                                <a href="proses_konfirmasi.jsp?id=<%= peminjaman[i].getId_peminjaman() %>&aksi=Ditolak" class="btn btn-danger btn-sm">
                                                                    Tolak
                                                                </a>
                                                                <%
                                                                    }
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <% } %>
                                                    </tbody>
                                                </table>                                           
                                            </div> <!-- end preview-->
                                        </div> <!-- end card body-->
                                    </div> <!-- end card -->
                                </div><!-- end col-->
                            </div>
                            <!-- end row -->        
                        </div> <!-- container -->

                        <!-- Footer Start -->
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

                <script>
                    $(document).ready(function () {
                        $('table.display').DataTable({
                            "scrollX": true
                        });
                    });
                </script>

                </body>
                </html>