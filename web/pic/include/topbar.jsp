<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession msession = request.getSession(false);
    if (msession != null && msession.getAttribute("nama_pic") != null) {
%>
<!-- Topbar Start -->
<div class="navbar-custom pe-0 d-flex justify-content-between align-items-center">
    <button class="button-menu-mobile open-left">
        <i class="mdi mdi-menu"></i>
    </button>
    <ul class="list-unstyled topbar-menu">
        <li class="dropdown notification-list">
            <a class="nav-link dropdown-toggle nav-user arrow-none me-0" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="false"
               aria-expanded="true">
                <span class="account-user-avatar"> 
                    <img src="http://localhost:8080/SIMPEL_Ganjil/assets/images/<%= (String) msession.getAttribute("foto_pic") %>" 
                         alt="user-image" class="rounded-circle">
                </span>
                <span>
                    <span class="account-user-name fw-bolder"><%= (String) msession.getAttribute("nama_pic")%></span>
                    <span class="account-user-name fw-normal"><%= (String) msession.getAttribute("email_pic")%></span>
                    <span class="account-position fw-light">PIC Lab</span>
                </span>
            </a>
            <div class="dropdown-menu dropdown-menu-end dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
                <!-- item-->
                <a href="LogoutPic.jsp" class="dropdown-item notify-item">
                    <i class="mdi mdi-logout me-1"></i>
                    <span>Logout</span>
                </a>
            </div>
        </li>
    </ul>
</div>
<!-- end Topbar -->
<%
    }else{
        request.getRequestDispatcher("/pic/login_pic.jsp").include(request, response);
    }
%>