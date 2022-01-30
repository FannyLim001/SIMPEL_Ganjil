<%-- 
    Document   : header
    Created on : Jan 30, 2022, 9:44:22 PM
    Author     : FANNY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- Header Start -->
    <div class="navbar-custom">
        <ul class="list-unstyled topbar-menu float-end mb-0">
            <li class="dropdown notification-list">
                <a class="nav-link dropdown-toggle nav-user arrow-none me-0" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="false"
                   aria-expanded="false">
                    <span class="account-user-avatar"> 
                        <img src="http://localhost:8080/SIMPEL_Ganjil/assets/images/users/avatar-2.jpg" alt="user-image" class="rounded-circle">
                    </span>
                    <span>
                        <span class="account-user-name">Kelompok 2</span>
                        <span class="account-position">Kepala Lab</span>
                    </span>
                </a>
                <div class="dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
                    <!-- item-->
                    <a href="http://localhost:8080/SIMPEL_Ganjil/admin/auth/logout" class="dropdown-item notify-item">
                        <i class="mdi mdi-logout me-1"></i>
                        <span>Logout</span>
                    </a>
                </div>
            </li>

        </ul>
        <button class="button-menu-mobile open-left">
            <i class="mdi mdi-menu"></i>
        </button>
    </div>
    <!-- end Topbar -->
</html>
