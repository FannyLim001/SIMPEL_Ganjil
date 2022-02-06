<%-- 
    Document   : laporan_peminjaman
    Created on : Jan 30, 2022, 9:47:16 PM
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
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Laporan Peminjaman | SIMPEL</title>
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
                                            <li class="breadcrumb-item active">Laporan Peminjaman</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Laporan Peminjaman SIMPEL</h4>
                                </div>
                            </div>
                        </div>
                        <!-- end page title --> 

                        <%
                            Gson gson = new Gson();
                            String nama_lab=null;
                            String jumlah_pinjam=null;

                            database db = new database();
                            db.connection();
                            ResultSet rs = null;
                            int total= Dashboard.getTotal_peminjaman();
                            String kolom [] = new String[total];
                            int jumlah [] = new int[total];
                    
                            try{    
                                    String sql = "select count(*) as jml_pinjam, nama_lab from tbl_peminjaman p, tbl_lab l where level between 2 and 3 "
                                            + "and p.id_lab=l.id_lab group by id_peminjaman";
                                    rs = db.getData(sql);
                    
                                    for(int i=0; i<total; i++){
                                        while(rs.next()){
                                            jumlah[i] = rs.getInt("jml_pinjam");
                                            kolom[i] = rs.getString("nama_lab");
                                        }
                                    }
                                    jumlah_pinjam = gson.toJson(jumlah);
                                    nama_lab = gson.toJson(kolom);
                                    db.disconnect(rs);
                            }
                            catch(SQLException e){
                                    out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
                            }
                        %>               
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-lg-10">
                                                <h4>Data Peminjaman Lab</h4>
                                            </div>
                                            <div class="col-lg-2 text-right">
                                                <a href="print_laporan.jsp" class="btn btn-primary btn-sm"><i class="mdi mdi-printer"></i>&nbsp;&nbsp;Cetak</a>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-xl-3">
                                                <h4>Tampilkan berdasarkan</h4>
                                                <div class="col-7">
                                                    <select class="form-select" id="filter">
                                                        <option value="12, 19, 3, 5, 2, 3">No Lab</option>
                                                        <option value="5, 19, 3, 1, 2, 3">Nama Lab</option>
                                                        <option value="7, 14, 2, 5, 2, 3">Level</option>
                                                        <option value="9, 19, 3, 5, 2, 3">Tahun Peminjaman</option>
                                                        <option value="13, 19, 5, 5, 2, 3">Status Peminjaman</option>
                                                    </select>
                                                </div>
                                            </div><!-- end col-->

                                            <div class="col-xl-9">
                                                <div dir="ltr">
                                                    <canvas id="myChart"></canvas>
                                                </div>
                                            </div><!-- end col-->
                                        </div>
                                        <!-- end row-->
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

        <script>
            const ctx = document.getElementById('myChart').getContext('2d');
            const myChart = new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                    datasets: [{
                            label: 'No Lab',
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
                            borderWidth: 1
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
            
            const filter = document.getElementById('filter');
            filter.addEventListener('change', Tracker);
            
            function Tracker(){
                const label = filter.options[filter.selectedIndex].text;
                myChart.data.datasets[0].label = label;
                myChart.data.datasets[0].data = filter.value.split(',');
                myChart.update();
            }

        </script>
    </body>
</html>
<% } %>