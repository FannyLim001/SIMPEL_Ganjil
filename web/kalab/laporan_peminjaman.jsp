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
                            
                            database db = new database();
                            db.connection();
                            ResultSet rs = null;
                            int total= Dashboard.getTotal_peminjaman();
                            int id_kalab = (Integer) session.getAttribute("id");
                    
                            try{
                                String sql = "select l.no_lab from tbl_lab l, tbl_kepala_lab k where "
                                            + "l.id_kalab=k.id_kalab and l.id_kalab='"+id_kalab+"'";
                                
                                String sql2 = "select count(*) as jml_pinjam from tbl_peminjaman p, tbl_lab l where level between 2 and 3 "
                                            + "and p.id_lab=l.id_lab group by id_peminjaman";
                                
                                String sql3 = "select distinct l.nama_lab from tbl_lab l, tbl_kepala_lab k where "
                                            + "l.id_kalab=k.id_kalab and l.id_kalab='"+id_kalab+"'";
                                
                                String sql4 = "select count(nama_lab) as jml_lab from tbl_lab l where "
                                            + "l.id_lab=l.id_lab group by nama_lab";
                                
                                String sql5 = "select count(*) as jml_pinjam, no_lab from tbl_peminjaman p, tbl_lab l where level between 2 and 3 "
                                            + "and p.id_lab=l.id_lab group by id_peminjaman";
                                rs = db.getData(sql);
                                
                                ArrayList ar=new ArrayList();
                                ArrayList ar2 = new ArrayList();

                                while(rs.next())
                                {
                                    no_lab = rs.getString("no_lab");
                                    ar.add(no_lab);
                                }
                                
                                rs = db.getData(sql2);
                                
                                while(rs.next())
                                {
                                    jumlah_nolab = rs.getString("jml_pinjam");
                                    ar2.add(jumlah_nolab);
                                }
                                
                                no_lab = gson.toJson(ar);
                                jumlah_nolab = gson.toJson(ar2);
                                
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
                                                    <select class="form-select" id="filter">
                                                        <option value="<%= jumlah_nolab %>">No Lab</option>
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
                    labels: <%= no_lab %>,
                    datasets: [{
                            label: 'No Lab',
                            data: <%= jumlah_nolab %>,
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

            function Tracker() {
                const label = filter.options[filter.selectedIndex].text;
                myChart.data.datasets[0].label = label;
                myChart.data.datasets[0].data = filter.value;
                myChart.update();
            }

        </script>
    </body>
</html>
<% } %>