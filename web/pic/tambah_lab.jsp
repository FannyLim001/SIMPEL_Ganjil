<%-- 
    Document   : tambah_lab
    Created on : Jan 31, 2022, 8:50:36 PM
    Author     : andre
--%>

<%@page import="models.pic.ModelPic"%>
<%@page import="controllers.pic.PicController"%>
<%@page import="models.pic.ModelKalab"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="javax.servlet.http.HttpSession" %>

<%
    HttpSession nsession = request.getSession(false);
    if (nsession != null && nsession.getAttribute("nama_pic") != null) {
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tambah Lab | SIMPEL</title>
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
                            <div class="col-lg-12">
                                <div class="card">
                                    <div class="card-body">

                                        <!-- Steps Information -->
                                        <div class="tab-content">

                                            <!-- Billing Content-->
                                            <div class="tab-pane show active" id="billing-information">
                                                <div class="row">
                                                    <div class="col-lg-12">
                                                        <h4 class="mt-2">Lab information</h4>

                                                        <p class="text-muted mb-4">Fill the form below in order to
                                                            input new lab data.</p>

                                                        <form action="simpan_lab.jsp" method="post">
                                                            <div class="row">
                                                                <div class="col-md-12">
                                                                    <div class="mb-3">
                                                                        <label for="nama_lab" class="form-label">Nama Lab</label>
                                                                        <input class="form-control" type="text" placeholder="Masukkan Nama Lab" id="nama_lab" name="nama_lab"/>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <div class="mb-3">
                                                                        <label for="no_lab" class="form-label">Nomor Ruangan <span class="text-danger">*</span></label>
                                                                        <input class="form-control" type="text" placeholder="Masukkan Nomor Ruangan" id="no_lab" name="no_lab"/>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <div class="mb-3">
                                                                        <label for="kapasitas_lab" class="form-label">Kapasitas <span class="text-danger">*</span></label>
                                                                        <input class="form-control" type="text" placeholder="Masukkan Kapasitas Lab" id="kapasitas_lab" name="kapasitas_lab"/>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div class="row">
                                                                <div class="col-12">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">PIC</label>
                                                                        <select data-toggle="select2" title="id_pic" name="id_pic">
                                                                            <%
                                                                                ModelPic[] pic = new PicController().getAllDataPic();
                                                                                for (int i = 0; i < pic.length; i++) {
                                                                            %>
                                                                            <option value="<%= pic[i].getId_pic() %>"><%= pic[i].getNama_pic() %></option>
                                                                            <%
                                                                                }
                                                                            %>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->
                                                            
                                                            <div class="row">
                                                                <div class="col-12">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Kepala Lab</label>
                                                                        <select data-toggle="select2" title="id_kalab" name="id_kalab">
                                                                            <%
                                                                                ModelKalab[] kalab = new PicController().getAllDataKalab();
                                                                                for (int i = 0; i < kalab.length; i++) {
                                                                            %>
                                                                            <option value="<%= kalab[i].getId_kalab()%>"><%= kalab[i].getNama_kalab()%></option>
                                                                            <%
                                                                                }
                                                                            %>                       
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div clas="row">
                                                                <div class="col-12">
                                                                    <div class="mb-3">
                                                                        <label for="foto_lab" class="form-label">Gambar</label>
                                                                        <input type="file" id="foto_lab" name="foto_lab" class="form-control">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            
                                                            <div class="row">
                                                                <div class="col-12">
                                                                    <div class="mb-3">
                                                                        <label class="form-label">Status Lab</label>
                                                                        <select data-toggle="select2" title="status_lab" name="status_lab">
                                                                            <option value="0">Pilih Status Lab</option>
                                                                            <option value="Available">Available</option>
                                                                            <option value="Not Available">Not Available</option>                           
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div> <!-- end row -->

                                                            <div class="row mt-4">
                                                                <div class="col-sm-6">
                                                                    <a href="daftar_lab.jsp" class="btn text-muted d-none d-sm-inline-block btn-link fw-semibold">
                                                                        <i class="mdi mdi-arrow-left"></i> Kembali</a>
                                                                </div> <!-- end col -->
                                                                <div class="col-sm-6">
                                                                    <div class="text-sm-end">
                                                                         <button type="submit" class="btn btn-primary btn-sm"><i class="mdi mdi-plus-circle me-2"></i>Tambah</button
                                                                    </div>
                                                                </div> <!-- end col -->
                                                            </div> <!-- end row -->
                                                        </form>
                                                    </div>
                                                </div><!-- comment -->
                                            </div>
                                        </div>
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
