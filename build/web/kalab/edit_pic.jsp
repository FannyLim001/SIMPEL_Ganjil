<%-- 
    Document   : edit_pic
    Created on : Feb 3, 2022, 12:24:52 AM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Edit Data PIC Lab | SIMPEL</title>
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
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Kepala Lab</a></li>
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Data PIC Lab</a></li>
                                            <li class="breadcrumb-item active">Edit Data PIC Lab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Edit Data PIC Lab</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row">
                                            <h4>PIC Lab</h4>
                                            <div class="row">
                                                <div class="col-3">
                                                    <label for="simpleinput" class="form-label">Nama PIC</label>
                                                    <input type="text" id="simpleinput" class="form-control" value="Nama">
                                                </div>
                                                <div class="col-2">
                                                    <label for="simpleinput" class="form-label">Lab</label>
                                                    <input type="text" id="simpleinput" class="form-control" value="Nomor Lab">
                                                </div>
                                            </div><!-- end col-->
                                        </div>
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <label for="simpleinput" class="form-label">Email</label>
                                                <input type="email" id="simpleinput" class="form-control" value="Email">
                                            </div>
                                            <div class="col-3">
                                                <label for="simpleinput" class="form-label">Password</label>
                                                <div class="input-group input-group-merge">
                                                    <input type="password" id="password" class="form-control" value="Password">
                                                    <div class="input-group-text" data-password="false">
                                                        <span class="password-eye"></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div><!-- end col-->
                                        <br>
                                        <div class="row">
                                            <div class="col-3">
                                                <a href="kalab_controller" class="btn btn-primary btn-sm"><i class="mdi mdi-account-edit"></i>&nbsp;&nbsp;Simpan</a>
                                            </div>
                                        </div>
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
