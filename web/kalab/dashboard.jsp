<%-- 
    Document   : dashboard
    Created on : Jan 30, 2022, 9:46:50 PM
    Author     : FANNY
--%>

<jsp:useBean id="Dashboard" class="models.kalab.DashboardModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%@page import="models.kalab.DashboardModel"%>
<% 
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
        int id_kalab = (Integer) session.getAttribute("id");
        
    DashboardModel[] dataDashboard = KalabController.getDataDashboard(id_kalab);
    
    for(int i=0; i<dataDashboard.length; i++){
        Dashboard = dataDashboard[i];
    }
%>

<jsp:setProperty name = "Dashboard" property = "total_peminjaman" value = "<%=Dashboard.getTotal_peminjaman()%>" />
<jsp:setProperty name = "Dashboard" property = "total_lab" value = "<%= Dashboard.getTotal_lab()%>" />
<jsp:setProperty name = "Dashboard" property = "total_disetujui" value = "<%= Dashboard.getTotal_disetujui()%>" />
<jsp:setProperty name = "Dashboard" property = "total_ditolak" value = "<%= Dashboard.getTotal_ditolak()%>" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="id">
    <head>
        <meta charset="utf-8" />
        <title>Dashboard Kepala Lab | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Dashboard</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Dashboard SIMPEL</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 

                        <div class="row">
                            <div class="col-xl-5 col-lg-6">

                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="card widget-flat">
                                            <div class="card-body">
                                                <div class="float-end">
                                                    <i class="mdi mdi-account-multiple widget-icon"></i>
                                                </div>
                                                <h4 class="text-muted fw-normal mt-0" title="Total Peminjaman">Total Peminjaman</h4>
                                                <h2 class="mt-3 mb-3"><jsp:getProperty name="Dashboard" property="total_peminjaman" /></h2>
                                            </div> <!-- end card-body-->
                                        </div> <!-- end card-->
                                    </div> <!-- end col-->

                                    <div class="col-sm-6">
                                        <div class="card widget-flat">
                                            <div class="card-body">
                                                <div class="float-end">
                                                    <i class="mdi mdi-cart-plus widget-icon"></i>
                                                </div>
                                                <h4 class="text-muted fw-normal mt-0" title="Total Lab">Total Lab</h4>
                                                <h2 class="mt-3 mb-3"><jsp:getProperty name="Dashboard" property="total_lab" /></h2>
                                            </div> <!-- end card-body-->
                                        </div> <!-- end card-->
                                    </div> <!-- end col-->
                                </div> <!-- end row -->

                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="card widget-flat">
                                            <div class="card-body">
                                                <div class="float-end">
                                                    <i class="mdi mdi-currency-usd widget-icon"></i>
                                                </div>
                                                <h4 class="text-muted fw-normal mt-0" title="Average Revenue">Peminjaman disetujui</h4>
                                                <h2 class="mt-3 mb-3"><jsp:getProperty name="Dashboard" property="total_disetujui" /></h2>
                                            </div> <!-- end card-body-->
                                        </div> <!-- end card-->
                                    </div> <!-- end col-->

                                    <div class="col-sm-6">
                                        <div class="card widget-flat">
                                            <div class="card-body">
                                                <div class="float-end">
                                                    <i class="mdi mdi-pulse widget-icon"></i>
                                                </div>
                                                <h4 class="text-muted fw-normal mt-0" title="Growth">Peminjaman ditolak</h4>
                                                <h2 class="mt-3 mb-3"><jsp:getProperty name="Dashboard" property="total_ditolak" /></h2>
                                            </div> <!-- end card-body-->
                                        </div> <!-- end card-->
                                    </div> <!-- end col-->
                                </div> <!-- end row -->

                            </div> <!-- end col -->

                            <div class="col-xl-7 col-lg-6">
                                <div class="card card-h-100">
                                    <div class="card-body">
                                        <h4 class="header-title mb-3">Peminjaman per-bulan</h4>

                                        <div dir="ltr">
                                            <!--<div id="high-performing-product" class="apex-charts" data-colors="#727cf5,#e3eaef"></div>-->
                                            <canvas id="dashboard_chart"></canvas>
                                        </div>

                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->

                            </div> <!-- end col -->
                        </div>
                        <!-- end row -->

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

        <script>
            const ctx = document.getElementById('dashboard_chart');
            const myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: '# of Votes',
                            data: [12, 19, 3, 5, 2, 3],
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)',
                                'rgba(153, 102, 255, 0.2)',
                                'rgba(255, 159, 64, 0.2)'
                            ],
                            borderColor: [
                                'rgba(255, 99, 132, 1)',
                                'rgba(54, 162, 235, 1)',
                                'rgba(255, 206, 86, 1)',
                                'rgba(75, 192, 192, 1)',
                                'rgba(153, 102, 255, 1)',
                                'rgba(255, 159, 64, 1)'
                            ],
                            borderWidth: 1,
                            barPercentage: 0.5,
                        }]
                },
                options: {
                    scales: {
                        y: {
                            beginAtZero: true
                        }
                    }
                }
            });
        </script>
    </body>
</html>
<% } %>
