<%-- 
    Document   : data_pic
    Created on : Jan 31, 2022, 11:09:45 PM
    Author     : FANNY
--%>

<%@page language="java" %>
<%@page import="models.kalab.PicModel"%>
<jsp:useBean id="Pic" class="models.kalab.PicModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<% 
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
    
    PicModel[] daftarPic = KalabController.getDaftarPic();
%>
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
                                            <li class="breadcrumb-item"><a href="dashboard.jsp">Kepala Lab</a></li>
                                            <li class="breadcrumb-item active">Data PIC Lab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Data PIC Lab SIMPEL</h4>
                                    <%
                                        if("berhasil".equals(request.getParameter("input"))){ %>
                                    <br>
                                    <div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                        <strong>Sukses - </strong> Data PIC berhasil ditambahkan!
                                    </div>
                                    <% } else if("gagal".equals(request.getParameter("input"))) { %>
                                    <br>
                                    <div class="alert alert-danger alert-dismissible bg-danger text-white border-0 fade show" role="alert">
                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                        <strong>Gagal - </strong> Data PIC gagal ditambahkan!
                                    </div>
                                    <% } %>
                                    <%
                                        if("berhasil".equals(request.getParameter("edit"))){ %>
                                    <br>
                                    <div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                        <strong>Sukses - </strong> Data PIC berhasil diubah!
                                    </div>
                                    <% } else if("gagal".equals(request.getParameter("edit"))) { %>
                                    <br>
                                    <div class="alert alert-danger alert-dismissible bg-danger text-white border-0 fade show" role="alert">
                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                        <strong>Gagal - </strong> Data PIC gagal diubah!
                                    </div>
                                    <% } %>
                                    <%
                                        if("berhasil".equals(request.getParameter("delete"))){ %>
                                    <br>
                                    <div class="alert alert-success alert-dismissible bg-success text-white border-0 fade show" role="alert">
                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                        <strong>Sukses - </strong> Data PIC berhasil dihapus!
                                    </div>
                                    <% } %>
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
                                                <%  
                                                            int num=1;
                                                            for(int i=0; i<daftarPic.length; i++){
                                                            Pic = daftarPic[i];
                                                %>
                                                <jsp:setProperty name = "Pic" property = "id_pic" value = "<%=Pic.getId_pic()%>" />
                                                <jsp:setProperty name = "Pic" property = "nama_pic" value = "<%=Pic.getNama_pic()%>" />
                                                <jsp:setProperty name = "Pic" property = "ruangan_pic" value = "<%= Pic.getRuangan_pic()%>" />
                                                <jsp:setProperty name = "Pic" property = "email_pic" value = "<%= Pic.getEmail_pic()%>" />
                                                <jsp:setProperty name = "Pic" property = "pass_pic" value = "<%= Pic.getPass_pic()%>" />
                                                <tr>
                                                    <td><%= num++ %></td>
                                                    <td><jsp:getProperty name="Pic" property="nama_pic" /></td>
                                                    <td><jsp:getProperty name="Pic" property="ruangan_pic" /></td>
                                                    <td><jsp:getProperty name="Pic" property="email_pic" /></td>
                                                    <td><jsp:getProperty name="Pic" property="pass_pic" /></td>
                                                    <td><a href="edit_pic.jsp?id_pic=<jsp:getProperty name="Pic" property="id_pic" />" class="btn btn-primary mb-2"><i class="mdi mdi-account-edit"></i>&nbsp;Edit</a>&nbsp;&nbsp;
                                                        <button type="button" class="btn btn-danger mb-2" data-bs-toggle="modal" data-bs-target="#btnDelete"><i class="mdi mdi-account-remove"></i>&nbsp;Hapus</button>
                                                    </td>
                                                </tr>
                                                <%}%>
                                            </tbody>
                                        </table>
                                        <div class="modal fade" id="btnDelete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                            <div class="modal-dialog modal-dialog-centered">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h4 class="modal-title" id="myModalLabel">Hapus Data PIC</h4>
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-hidden="true"></button>
                                                    </div>
                                                    <div class="modal-body">
                                                        Apakah anda yakin ingin menghapus data ini? data yang dihapus tidak dapat dikembalikan
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-light" data-bs-dismiss="modal">Batalkan</button>
                                                        <a href="delete_pic.jsp?id_pic=<jsp:getProperty name="Pic" property="id_pic" />" class="btn btn-danger">Hapus</a>
                                                    </div>
                                                </div><!-- /.modal-content -->
                                            </div><!-- /.modal-dialog -->
                                        </div><!-- /.modal -->
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
<% } %>
