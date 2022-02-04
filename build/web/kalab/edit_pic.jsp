<%-- 
    Document   : edit_pic
    Created on : Feb 3, 2022, 12:24:52 AM
    Author     : FANNY
--%>

<%@page language="java" %>
<%@page import="models.kalab.PicModel"%>
<jsp:useBean id="Pic" class="models.kalab.PicModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<% 
    int id_pic = Integer.parseInt(request.getParameter("id_pic"));
    Pic = KalabController.getDataPicbyID(id_pic);
    PicModel[] daftarPic = KalabController.getDaftarPic();
%>

<jsp:setProperty name = "Pic" property = "id_pic" value = "<%=Pic.getId_pic()%>" />
<jsp:setProperty name = "Pic" property = "nama_pic" value = "<%=Pic.getNama_pic()%>" />
<jsp:setProperty name = "Pic" property = "ruangan_pic" value = "<%= Pic.getRuangan_pic()%>" />
<jsp:setProperty name = "Pic" property = "email_pic" value = "<%= Pic.getEmail_pic()%>" />
<jsp:setProperty name = "Pic" property = "pass_pic" value = "<%= Pic.getPass_pic()%>" />
<jsp:setProperty name = "Pic" property = "kontak_pic" value = "<%= Pic.getKontak_pic()%>" />

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
                                            <li class="breadcrumb-item"><a href="dashboard.jsp">Kepala Lab</a></li>
                                            <li class="breadcrumb-item"><a href="data_pic.jsp">Data PIC Lab</a></li>
                                            <li class="breadcrumb-item active">Edit Data PIC Lab</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Edit Data PIC Lab</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 
                        <form action="olahedit_pic.jsp" method="post">
                            <input type="hidden" name="id_pic" value="<jsp:getProperty name="Pic" property="id_pic" />">
                            <div class="row">
                                <div class="col-12">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="row">
                                                <h4>PIC Lab</h4>
                                                <div class="row">
                                                    <div class="col-3">
                                                        <label for="simpleinput" class="form-label">Nama PIC</label>
                                                        <input type="text" name="nama_pic" class="form-control" value="<jsp:getProperty name="Pic" property="nama_pic" />">
                                                    </div>
                                                    <div class="col-2">
                                                        <label for="simpleinput" class="form-label">Ruangan PIC</label>
                                                        <input type="text" name="ruangan_pic" class="form-control" value="<jsp:getProperty name="Pic" property="ruangan_pic" />">
                                                    </div>
                                                </div><!-- end col-->
                                            </div>
                                            <br>
                                            <div class="row">
                                                <div class="col-3">
                                                    <label for="simpleinput" class="form-label">Email</label>
                                                    <input type="email" name="email_pic" class="form-control" value="<jsp:getProperty name="Pic" property="email_pic" />">
                                                </div>
                                                <div class="col-3">
                                                    <label for="simpleinput" class="form-label">Password</label>
                                                    <div class="input-group input-group-merge">
                                                        <input type="password" name="pass_pic" class="form-control" value="<jsp:getProperty name="Pic" property="pass_pic" />">
                                                        <div class="input-group-text" data-password="false">
                                                            <span class="password-eye"></span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-2">
                                                        <label for="simpleinput" class="form-label">Kontak</label>
                                                        <input type="text" name="kontak_pic" class="form-control" value="<jsp:getProperty name="Pic" property="kontak_pic" />">
                                                    </div>
                                            </div><!-- end col-->
                                            <br>
                                            <div class="row">
                                                <div class="col-3">
                                                    <button type="submit" class="btn btn-primary btn-sm" name="update"><i class="mdi mdi-account-edit"></i>&nbsp;&nbsp;Simpan</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div> <!-- end card -->
                                </div> <!-- end col-->        
                            </div> <!-- end row -->
                        </form>

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
