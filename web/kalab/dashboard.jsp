<%-- 
    Document   : dashboard
    Created on : Jan 30, 2022, 9:46:50 PM
    Author     : FANNY
--%>

<jsp:useBean id="Dashboard" class="models.kalab.DashboardModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<%@page import="java.util.*,java.sql.*" %>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>
<%@page import="config.database"%>
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
                                                    <i class="mdi mdi-clipboard-multiple widget-icon"></i>
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
                                                    <i class="mdi mdi-desktop-tower-monitor widget-icon"></i>
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
                                                    <i class="mdi mdi-clipboard-check-multiple widget-icon"></i>
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
                                                    <i class="mdi mdi-clipboard-off widget-icon"></i>
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

        <%
            Gson gson = new Gson();
            String data_bulan=null;

            database db = new database();
            db.connection();
            int yVal [] = new int[12];
            ResultSet rs = null;
            int total= Dashboard.getTotal_peminjaman();
                    
            try{    
                    String sql = "select monthname(tgl_peminjaman) as bulan from tbl_peminjaman where level between 2 and 3";
                    rs = db.getData(sql);
                    
                    for(int i=1; i<total; i++){
                        while(rs.next()){
                                if(rs.getString("bulan").equals("January")){
                                    yVal[0]=yVal[0]+1;
                                } else if(rs.getString("bulan").equals("February")){
                                    yVal[1]=yVal[1]+1;
                                } else if(rs.getString("bulan").equals("March")){
                                    yVal[2]=yVal[2]+1;
                                } else if(rs.getString("bulan").equals("April")){
                                    yVal[3]=yVal[3]+1;
                                } else if(rs.getString("bulan").equals("May")){
                                    yVal[4]=yVal[4]+1;
                                } else if(rs.getString("bulan").equals("June")){
                                    yVal[5]=yVal[5]+1;
                                } else if(rs.getString("bulan").equals("July")){
                                    yVal[6]=yVal[6]+1;
                                } else if(rs.getString("bulan").equals("August")){
                                    yVal[7]=yVal[7]+1;
                                } else if(rs.getString("bulan").equals("September")){
                                    yVal[8]=yVal[8]+1;
                                } else if(rs.getString("bulan").equals("October")){
                                    yVal[9]=yVal[9]+1;
                                } else if(rs.getString("bulan").equals("November")){
                                    yVal[10]=yVal[10]+1;
                                } else if(rs.getString("bulan").equals("December")){
                                    yVal[11]=yVal[11]+1;
                                }
                        }
                    }
                    data_bulan = gson.toJson(yVal);
                    db.disconnect(rs);
            }
            catch(SQLException e){
                    out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
            }
        %>

        <script>
            const ctx = document.getElementById('dashboard_chart');
            const myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: [
                        "Jan",
                        "Feb",
                        "Mar",
                        "Apr",
                        "Mei",
                        "Jun",
                        "Jul",
                        "Agu",
                        "Sep",
                        "Okt",
                        "Nov",
                        "Des",
                    ],
                    datasets: [{
                            label: 'Data Peminjaman tiap bulan',
                            data: <%= data_bulan %>,
                            backgroundColor: [
                                'rgba(255, 99, 132, 0.7)',
                                'rgba(54, 162, 235, 0.7)',
                                'rgba(255, 206, 86, 0.7)',
                                'rgba(75, 192, 192, 0.7)',
                                'rgba(153, 102, 255, 0.7)',
                                'rgba(255, 159, 64, 0.7)'
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
                        x: {
                            grid: {
                                display: false
                            }
                        },
                        y: {
                            beginAtZero: true,
                            grid: {
                                display: false
                            }
                        }
                    }
                }
            });
        </script>
    </body>
</html>
<% } %>
