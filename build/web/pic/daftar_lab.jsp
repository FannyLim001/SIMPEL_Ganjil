<%-- 
    Document   : daftar_lab
    Created on : Jan 29, 2022, 6:03:00 PM
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!-- Models -->
<%@page import="models.pic.InformasiLab"%>
<!-- Controllers -->
<%@page import="controllers.pic.PicController"%>

<%@page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession nsession = request.getSession(false);
    if (nsession != null && nsession.getAttribute("nama_pic") != null) {
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Data Lab | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Daftar Lab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Data Lab Politeknik Caltex Riau</h4>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 

                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row mb-2">
                                            <div class="col-sm-5">
                                                <a href="tambah_lab.jsp" class="btn btn-primary mb-2"><i class="mdi mdi-plus-circle me-2"></i> Tambah Lab</a>
                                            </div>
                                        </div>
                                        <div class="tab-content">
                                            <div class="tab-pane show active" id="basic-datatable-preview">
                                                <table id="tbl-daftarlab" class="table dt-responsive w-100 display">
                                                    <thead class="table-light">
                                                        <tr>
                                                            <th>Gambar</th>
                                                            <th>Nomor</th>
                                                            <th>Nama</th>
                                                            <th>Kapasitas</th>
                                                            <th>PIC</th>
                                                            <th>KALAB</th>
                                                            <th>Status</th>
                                                            <th>Action</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <%
                                                            InformasiLab[] daftar = new PicController().getDataLab();
                                                            for (int i = 0; i < daftar.length; i++) {
                                                        %>
                                                        <tr>
                                                            <td class="table-user"><%= daftar[i].getFoto_lab()%></td>
                                                            <td><%= daftar[i].getNo_lab()%></td>
                                                            <td><%= daftar[i].getNama_lab()%></td>
                                                            <td><%= daftar[i].getKapasitas()%></td>
                                                            <td><%= daftar[i].getPic_lab()%></td>
                                                            <td><%= daftar[i].getKetua_lab()%></td>
                                                            <td class="text-center">
                                                                <%
                                                                    String status = daftar[i].getStatus();
                                                                    if (status.equalsIgnoreCase("available")) {%>
                                                                <span class="badge bg-success p-2"><%= status%></span>
                                                                <% } else if (status.equalsIgnoreCase("not available")) {%>
                                                                <span class="badge bg-danger p-2"><%= status%></span>
                                                                <% }
                                                                %>
                                                            </td>
                                                            <td class="table-action">
                                                                <a href="edit_lab.jsp" class="action-icon"> <i class="mdi mdi-pencil"></i></a>
                                                                <a href="javascript: void(0);" class="action-icon"> <i class="mdi mdi-delete"></i></a>
                                                            </td>
                                                        </tr>
                                                        <% }%>
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
