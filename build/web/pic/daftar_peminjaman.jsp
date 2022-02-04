<%-- 
    Document   : data_peminjaman
    Created on : Jan 26, 2022, 2:25:41 PM
    Author     : Egy Dya Hermawan
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.http.HttpSession" %>

<!-- Models -->
<%@page import="models.pic.Peminjaman"%>

<!-- Controllers -->
<%@page import="controllers.pic.PicController"%>

<%
    HttpSession nsession = request.getSession(false);
    if (nsession != null && nsession.getAttribute("nama_pic") != null) {
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Daftar Peminjaman | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Daftar Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Daftar Peminjaman</h4>
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
                                                <h5>Daftar Peminjaman</h5>
                                                <table id="tbl-selesai" class="table dt-responsive w-100 display">
                                                    <thead class="table-light">
                                                        <tr class="text-center">
                                                            <th>Lab</th>
                                                            <th>Ketua Kegiatan</th>
                                                            <th>Level</th>
                                                            <th>Tgl Peminjaman</th>
                                                            <th>Keterangan</th>
                                                            <th>Status</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            Peminjaman[] daftar = new PicController().getDataPeminjaman();
                                                            for (int i = 0; i < daftar.length; i++) {
                                                        %>
                                                        <tr>
                                                            <td><%= daftar[i].getNo_lab() %></td>
                                                            <td><%= daftar[i].getKetua_kegiatan() %></td>
                                                            <td class="text-center"><%= daftar[i].getLevel() %></td>
                                                            <td class="text-center"><%= daftar[i].getTgl_peminjaman()%></td>
                                                            <td><%= daftar[i].getKeterangan() %></td>
                                                            <td class="text-center">
                                                            <%
                                                                String status = daftar[i].getStatus_peminjaman();
                                                                if (status.equalsIgnoreCase("diajukan")) { %>
                                                                    <span class="badge bg-warning p-2"><%= status %></span>
                                                                <% } else if (status.equalsIgnoreCase("menunggu")) { %>
                                                                    <span class="badge bg-secondary p-2"><%= status %></span>
                                                                <% } else if (status.equalsIgnoreCase("disetujui")) { %>
                                                                    <span class="badge bg-info p-2"><%= status %></span>
                                                                <% } else if (status.equalsIgnoreCase("ditolak")) { %>
                                                                    <span class="badge bg-danger p-2"><%= status %></span>   
                                                                <% } else if (status.equalsIgnoreCase("selesai")) { %>
                                                                    <span class="badge bg-success p-2"><%= status %></span>   
                                                                <% }
                                                            %>
                                                            </td>
                                                            <td class="table-action text-center">
                                                                <a href="http://localhost:8080/SIMPEL_Ganjil/pic/detail_peminjaman.jsp?id_peminjaman=<%= daftar[i].getId_peminjaman() %>" 
                                                                   class="btn btn-primary mb-2">Detail</a>
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

            <script>
                $(document).ready(function () {
                    $('table.display').DataTable({
                        "scrollX": true
                    });
                });
            </script>
            <%
                }else{
                    request.setAttribute("kondisi_login", "belum");
                    request.getRequestDispatcher("/pic/login_pic.jsp").include(request, response);
                }
            %>
    </body>
</html>