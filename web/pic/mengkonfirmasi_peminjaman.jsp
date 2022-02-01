<%-- 
    Document   : beranda.jsp
    Created on : Jan 26, 2022, 2:48:55 PM
    Author     : SHOLAWATI
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="models.pic.Peminjaman"%>

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
                                                            <th>Aksi</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            Peminjaman dpDalamProses = new Peminjaman();
                                                            List<Peminjaman> daftar = new ArrayList<Peminjaman>();
                                                            daftar = dpDalamProses.peminjamanDiajukan();
                                                            for (int i = 0; i < daftar.size(); i++) {
                                                        %>
                                                        <tr>
                                                            <td><%= daftar.get(i).getNo_lab() %></td>
                                                            <td><%= daftar.get(i).getKetua_kegiatan() %></td>
                                                            <td class="text-center"><%= daftar.get(i).getKontak_ketua() %></td>
                                                            <td class="text-center"><%= daftar.get(i).getLevel() %></td>
                                                            <td class="text-center"><%= daftar.get(i).getTgl_peminjaman() %></td>
                                                            <td class="text-center"><%= daftar.get(i).getTgl_mulai() %></td>
                                                            <td class="text-center"><%= daftar.get(i).getTgl_berakhir() %></td>
                                                            <td><%= daftar.get(i).getKeterangan() %></td>
                                                            <td class="text-center">
                                                                <%
                                                                    String status = daftar.get(i).getStatus_peminjaman();
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