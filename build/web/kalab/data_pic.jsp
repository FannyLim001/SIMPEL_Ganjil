<%-- 
    Document   : data_pic
    Created on : Jan 31, 2022, 11:09:45 PM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
    <head>
        <meta charset="utf-8" />
        <title>Data PIC Lab | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Data PIC Lab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Data PIC Lab SIMPEL</h4>
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
                                                <h4>PIC Lab</h4>
                                            </div>
                                            <div class="col-lg-2 text-right">
                                                <a href="add_pic.jsp" class="btn btn-primary btn-sm"><i class="mdi mdi-account-plus"></i>&nbsp;&nbsp;Tambah</a>
                                            </div>
                                        </div>
                                        <br>
                                        <table id="tbl-proses" class="table dt-responsive nowrap w-100">
                                            <thead class="table-light">
                                                <tr class="text-center">
                                                    <th>No</th>
                                                    <th>Nama</th>
                                                    <th>Lab</th>
                                                    <th>Email</th>
                                                    <th>Password</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>1</td>
                                                    <td>Dwi Listiyanti</td>
                                                    <td>LAB 330</td>
                                                    <td>dwilisty@pcr.ac.id</td>
                                                    <td>dwi124</td>
                                                    <td><a href="edit_pic.jsp" class="btn btn-primary mb-2"><i class="mdi mdi-account-edit"></i>&nbsp;Edit</a>&nbsp;&nbsp;
                                                        <a href="delete_pic.jsp" class="btn btn-danger mb-2"><i class="mdi mdi-account-remove"></i>&nbsp;Hapus</a></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div> <!-- end card -->
                                </div><!-- end col-->
                            </div>
                            <!-- end row -->        
                        </div> <!-- container -->

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
