<%-- 
    Document   : footer
    Created on : Jan 30, 2022, 9:44:11 PM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <!-- Footer Start -->
        <footer class="footer">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-6">
                        <script>document.write(new Date().getFullYear())</script> © SIMPEL - Development by Ganjil 2TID
                    </div>
                    <div class="col-md-6">
                        <div class="text-md-end footer-links d-none d-md-block">
                            <a href="https://github.com/FannyLim001/SIMPEL_Ganjil">Developer Page</a>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
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
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/apexcharts.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/jquery-jvectormap-world-mill-en.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor/Chart.bundle.min.js"></script>
        <!-- third party js ends -->

        <!-- demo app -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.datatable-init.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.dashboard.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/pages/demo.chartjs.js"></script>
        <!-- end demo js-->

        <script>
                    $(document).ready(function () {
                        $('#tbl-proses').DataTable({
                        });
                    });
                    $(document).ready(function () {
                        $('#tbl-selesai').DataTable({
                        });
                    });
        </script>
    </body>
    <!-- end Footer -->
</html>
