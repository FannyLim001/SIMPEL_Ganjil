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
<%@page import="org.json.JSONArray"%>
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
                            String no_lab=null;
                            String jumlah_nolab=null;
                            
                            String nama_lab=null;
                            String jumlah_lab=null;
                            
                            String level=null;
                            String jumlah_level=null;
                            
                            String thn_peminjaman=null;
                            String jumlah_thn=null;
                            
                            String status_peminjaman=null;
                            String jumlah_status=null;
                            
                            ArrayList ar=new ArrayList();
                            ArrayList ar2 = new ArrayList();
                            ArrayList ar3 = new ArrayList();
                            ArrayList ar4 = new ArrayList();
                            ArrayList ar5 = new ArrayList();
                            ArrayList ar6 = new ArrayList();
                            ArrayList ar7 = new ArrayList();
                            ArrayList ar8 = new ArrayList();
                            ArrayList ar9 = new ArrayList();
                            ArrayList ar10 = new ArrayList();
                            
                            database db = new database();
                            db.connection();
                            ResultSet rs = null;
                    
                            try{
                                String sql = "select count(*) as jml_pinjam, no_lab from tbl_peminjaman p, tbl_lab l where p.id_lab=l.id_lab group by l.id_lab";
                                
                                String sql2 = "select count(*) as jml_lab, nama_lab from tbl_peminjaman p, tbl_lab l where p.id_lab=l.id_lab group by l.id_lab";
                                
                                String sql3 = "select count(*) as jml_level, level from tbl_peminjaman group by level";
                                
                                String sql4 = "select count(year(tgl_peminjaman)) as jml_thn, year(tgl_peminjaman) as thn from tbl_peminjaman group by thn";
                                
                                String sql5 = "select count(status_peminjaman) as jml_status, status_peminjaman from tbl_peminjaman group by status_peminjaman";
                                
                                rs = db.getData(sql);
                                while(rs.next())
                                {
                                    no_lab = rs.getString("no_lab");
                                    jumlah_nolab = rs.getString("jml_pinjam");
                                    ar.add(no_lab);
                                    ar2.add(jumlah_nolab);
                                }
                                
                                rs = db.getData(sql2);
                                while(rs.next())
                                {
                                    nama_lab = rs.getString("nama_lab");
                                    jumlah_lab = rs.getString("jml_lab");
                                    ar3.add(nama_lab);
                                    ar4.add(jumlah_lab);
                                }
                                
                                rs = db.getData(sql3);
                                while(rs.next())
                                {
                                    level = rs.getString("level");
                                    jumlah_level = rs.getString("jml_level");
                                    ar5.add(level);
                                    ar6.add(jumlah_level);
                                }
                                
                                rs = db.getData(sql4);
                                while(rs.next())
                                {
                                    thn_peminjaman = rs.getString("thn");
                                    jumlah_thn = rs.getString("jml_thn");
                                    ar7.add(thn_peminjaman);
                                    ar8.add(jumlah_thn);
                                }
                                
                                rs = db.getData(sql5);
                                while(rs.next())
                                {
                                    status_peminjaman = rs.getString("status_peminjaman");
                                    jumlah_status = rs.getString("jml_status");
                                    ar9.add(status_peminjaman);
                                    ar10.add(jumlah_status);
                                }
                                
                            }
                            catch(SQLException e){
                                    out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
                            }
                            
                                no_lab = gson.toJson(ar);
                                jumlah_nolab = gson.toJson(ar2);
                                
                                nama_lab = gson.toJson(ar3);
                                jumlah_lab = gson.toJson(ar4);
                                
                                level = gson.toJson(ar5);
                                jumlah_level = gson.toJson(ar6);
                                
                                thn_peminjaman = gson.toJson(ar7);
                                jumlah_thn = gson.toJson(ar8);
                                
                                status_peminjaman = gson.toJson(ar9);
                                jumlah_status = gson.toJson(ar10);
                        %>

                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-lg-10">
                                                <h4>Data Peminjaman Lab</h4>
                                            </div>
                                            <div class="col-lg-2">
                                                <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#standard-modal"><i class="mdi mdi-printer"></i>&nbsp;&nbsp;Cetak</button>
                                                <div id="standard-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="standard-modalLabel" aria-hidden="true">
                                                    <div class="modal-dialog modal-sm modal-dialog-centered">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h4 class="modal-title" id="standard-modalLabel">Cetak Data Peminjaman</h4>
                                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-hidden="true"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                <form class="ps-3 pe-3" action="format_laporan.jsp">
                                                                    <div class="mb-3">
                                                                        <div class="form-check">
                                                                            <input type="radio" id="customRadio3" name="format" value="xlsx" class="form-check-input">
                                                                            <label class="form-check-label" for="customRadio3">Excel (.xlsx)</label>
                                                                        </div>
                                                                    </div>
                                                                    <div class="mb-3">
                                                                        <div class="form-check">
                                                                            <input type="radio" id="customRadio4" name="format" value="pdf" class="form-check-input">
                                                                            <label class="form-check-label" for="customRadio4">PDF (.pdf)</label>
                                                                        </div>
                                                                    </div>
                                                                    <div class="mb-3 text-center">
                                                                        <button class="btn btn-primary" type="submit">Cetak</button>
                                                                    </div>
                                                                </form>
                                                            </div>
                                                        </div><!-- /.modal-content -->
                                                    </div><!-- /.modal-dialog -->
                                                </div><!-- /.modal -->
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-xl-3">
                                                <h4>Tampilkan berdasarkan</h4>
                                                <div class="col-7">
                                                    <select class="form-select" id="filter" onchange="updateData(this)">
                                                        <option value="no_lab">No Lab</option>
                                                        <option value="nama_lab">Nama Lab</option>
                                                        <option value="level">Level</option>
                                                        <option value="tahun_peminjaman">Tahun Peminjaman</option>
                                                        <option value="status">Status Peminjaman</option>
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
            const no_lab = <%= jumlah_nolab %>;
            const nama_lab = <%= jumlah_lab %>;
            const level = <%= jumlah_level %>;
            const tahun_peminjaman = <%= jumlah_thn %>;
            const status = <%= jumlah_status %>;

            const label_no = <%= no_lab %>;
            const label_nama = <%= nama_lab %>;
            const label_level = <%= level %>;
            const label_thn = <%= thn_peminjaman %>;
            const label_status = <%= status_peminjaman %>;
            //setup
            const data = {
                labels: <%= no_lab %>,
                datasets: [{
                        label: 'No Lab',
                        data: no_lab,
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
                        barPercentage: 0.5
                    }]
            };

            //config
            const config = {
                type: 'bar',
                data,
                options: {
                    scales: {
                        yAxes: [{
                                ticks: {
                                    beginAtZero: true
                                }
                            }]
                    }
                }
            };

            //render
            const myChart = new Chart(
                    document.getElementById('myChart'),
                    config
                    );

            const filter = document.getElementById('filter');

            function updateData(data) {
                const label = filter.options[filter.selectedIndex].text;
                if (data.value === 'no_lab') {
                    myChart.config.data.datasets[0].data = no_lab;
                    myChart.config.data.datasets[0].label = label;
                    myChart.config.data.labels = label_no;
                }
                if (data.value === 'nama_lab') {
                    myChart.config.data.datasets[0].data = nama_lab;
                    myChart.config.data.datasets[0].label = label;
                    myChart.config.data.labels = label_nama;
                }
                if (data.value === 'level') {
                    myChart.config.data.datasets[0].data = level;
                    myChart.config.data.datasets[0].label = label;
                    myChart.config.data.labels = label_level;
                }
                if (data.value === 'tahun_peminjaman') {
                    myChart.config.data.datasets[0].data = tahun_peminjaman;
                    myChart.config.data.datasets[0].label = label;
                    myChart.config.data.labels = label_thn;
                }
                if (data.value === 'status') {
                    myChart.config.data.datasets[0].data = status;
                    myChart.config.data.datasets[0].label = label;
                    myChart.config.data.labels = label_status;
                }
                myChart.update();
            }

        </script>
    </body>
</html>
<% } %>