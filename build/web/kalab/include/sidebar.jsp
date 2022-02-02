<%-- 
    Document   : sidebar
    Created on : Jan 30, 2022, 9:44:33 PM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <!-- ========== Left Sidebar Start ========== -->
<div class="leftside-menu">

    <!-- LOGO -->
    <a href="index.html" class="logo text-center logo-light">
        <span class="logo-lg">
            <img src="http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png" height="16">
        </span>
        <span class="logo-sm">
            <img src="http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png" alt="" height="16">
        </span>
    </a>

    <div class="h-100" id="leftside-menu-container" data-simplebar>

        <!--- Sidemenu -->
        <ul class="side-nav">

            <li class="side-nav-title side-nav-item text-center">Navigation</li>
            <li class="side-nav-item">
                <a href="http://localhost:8080/SIMPEL_Ganjil/kalab/dashboard.jsp" class="side-nav-link">
                    <i class="uil-home-alt"></i>
                    <span> Dashboard </span>
                </a>
            </li>
            <li class="side-nav-item">
                <a href="http://localhost:8080/SIMPEL_Ganjil/kalab/daftar_peminjaman.jsp" class="side-nav-link">
                    <i class="mdi mdi-office-building"></i>
                    <span> Peminjaman </span>
                </a>
            </li>
            <li class="side-nav-item">
                <a href="http://localhost:8080/SIMPEL_Ganjil/kalab/data_pic.jsp" class="side-nav-link">
                    <i class="mdi mdi-office-building"></i>
                    <span> PIC Lab </span>
                </a>
            </li>
            <li class="side-nav-item">
                <a href="http://localhost:8080/SIMPEL_Ganjil/kalab/laporan_peminjaman.jsp" class="side-nav-link">
                    <i class="mdi mdi-trophy"></i>
                    <span> Laporan Peminjaman</span>
                </a>
            </li>
        </ul>
        <!-- End Sidebar -->

        <div class="clearfix"></div>

    </div>
    <!-- Sidebar -left -->

</div>
<!-- Left Sidebar End -->
</html>
