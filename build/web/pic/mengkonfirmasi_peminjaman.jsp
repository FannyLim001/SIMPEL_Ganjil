<%-- 
    Document   : beranda.jsp
    Created on : Jan 26, 2022, 2:48:55 PM
    Author     : SHOLAWATI
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="models.pic.DaftarPeminjaman"%>

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
                                                <h5>Konfirmasi Peminjaman Lab</h5>
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
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            DaftarPeminjaman dpDalamProses = new DaftarPeminjaman();
                                                            List<DaftarPeminjaman> dataDalamProses = new ArrayList<DaftarPeminjaman>();
                                                            dataDalamProses = dpDalamProses.tampilDaftarDalamProses();
                                                            for (int i = 0; i < dataDalamProses.size(); i++) {
                                                        %>
                                                        <tr>
                                                            <td><%= dataDalamProses.get(i).getNo_lab() %></td>
                                                            <td><%= dataDalamProses.get(i).getKetua_kegiatan() %></td>
                                                            <td class="text-center"><%= dataDalamProses.get(i).getKontak_ketua() %></td>
                                                            <td class="text-center"><%= dataDalamProses.get(i).getLevel() %></td>
                                                            <td class="text-center"><%= dataDalamProses.get(i).getTgl_peminjaman() %></td>
                                                            <td class="text-center"><%= dataDalamProses.get(i).getTgl_mulai() %></td>
                                                            <td class="text-center"><%= dataDalamProses.get(i).getTgl_berakhir() %></td>
                                                            <td><%= dataDalamProses.get(i).getKeterangan() %></td>
                                                            <td class="text-center">
                                                                <%
                                                                    if (dataDalamProses.get(i).getStatus().equalsIgnoreCase("diajukan")) { %>
                                                                <span class="badge bg-warning p-2"><%= dataDalamProses.get(i).getStatus() %></span>
                                                                <%
                                                                        }else if (dataDalamProses.get(i).getStatus().equalsIgnoreCase("menunggu")){ %>
                                                                <span class="badge bg-secondary p-2"><%= dataDalamProses.get(i).getStatus() %></span>
                                                                <%
                                                                        }else if (dataDalamProses.get(i).getStatus().equalsIgnoreCase("ditolak")){ %>
                                                                <span class="badge bg-danger p-2"><%= dataDalamProses.get(i).getStatus() %></span>
                                                                <%    
                                                                        }else if (dataDalamProses.get(i).getStatus().equalsIgnoreCase("disetujui")){ %>
                                                                <span class="badge bg-success p-2"><%= dataDalamProses.get(i).getStatus() %></span>
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