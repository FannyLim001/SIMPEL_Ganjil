<%-- 
    Document   : login
    Created on : Feb 2, 2022, 9:19:27 PM
    Author     : FANNY
--%>

<%@page language="java" %>
<%@page import="models.kalab.KalabModel"%>
<jsp:useBean id="Kalab" class="models.kalab.KalabModel" />
<jsp:useBean id="KalabController" class="controllers.kalab.KalabController" />
<% 
    int id_kalab = 1;
    Kalab = KalabController.getDataKalabbyID(id_kalab);
    KalabModel[] daftarKalab = KalabController.getDaftarKalab();
%>

<jsp:setProperty name = "Kalab" property = "email_kalab" value = "<%= Kalab.getEmail_kalab()%>" />
<jsp:setProperty name = "Kalab" property = "pass_kalab" value = "<%= Kalab.getPass_kalab()%>" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Log In Kepala Lab | SIMPEL </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="http://localhost:8080/SIMPEL_Ganjil/assets/images/favicon.ico">

        <!-- App css -->
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app.min.css" rel="stylesheet" type="text/css" id="light-style" />
        <link href="http://localhost:8080/SIMPEL_Ganjil/assets/css/app-dark.min.css" rel="stylesheet" type="text/css" id="dark-style" />
        
        <script>  
    function validateForm() {  
        //collect form data in JavaScript variables  
        var email1 = document.getElementById("input_email").value;
        var email2 = document.getElementById("db_email").value;
        var pw1 = document.getElementById("input_pass").value;  
        var pw2 = document.getElementById("db_pass").value;  
        
        if(email1!=email2) {  
          document.getElementById("message1").innerHTML = "**Email salah!";  
          return false;  
        } else {
            return true
        }
        
        if(pw1!=pw2) {  
          document.getElementById("message2").innerHTML = "**Password salah!";  
          return false;  
        } else {
            return true;
        }
     }  
    </script> 
    </head>
    <body class="loading authentication-bg" data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
        <div class="account-pages pt-2 pt-sm-5 pb-4 pb-sm-5">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-xxl-4 col-lg-5">
                        <div class="card">

                            <!-- Logo -->
                            <div class="card-header pt-4 pb-4 text-center bg-primary">
                                <a href="dashboard.jsp">
                                    <span><img src="http://localhost:8080/SIMPEL_Ganjil/assets/images/logo.png" alt="" height="18"></span>
                                </a>
                            </div>

                            <div class="card-body p-4">

                                <div class="text-center w-75 m-auto">
                                    <h4 class="text-dark-50 text-center pb-0 fw-bold">Log In</h4>
                                    <p class="text-muted mb-4">Masukkan email PCR dan password anda untuk mengakses sistem</p>
                                </div>

                                <form onsubmit ="return validateForm()" id="login_form" action="../Login" method="post">
                                    <input class="form-control" type="hidden" id="db_email" value="<jsp:getProperty name = "Kalab" property = "email_kalab" />">
                                    <input type="hidden" id="db_pass" class="form-control" value="<jsp:getProperty name = "Kalab" property = "pass_kalab" />">
                                    
                                    <div class="mb-3">
                                        <label for="emailaddress" class="form-label">Email address</label>
                                        <input class="form-control" type="email" id="input_email" name="email" required="" placeholder="Enter your email"><br>
                                        <span id = "message1" style="color:red"> </span>
                                    </div>

                                    <div class="mb-3">
                                        <label for="password" class="form-label">Password</label>
                                        <div class="input-group input-group-merge">
                                            <input type="password" id="input_pass" class="form-control" name="password" placeholder="Enter your password">
                                            <div class="input-group-text" data-password="false">
                                                <span class="password-eye"></span>
                                            </div>
                                        </div>
                                        <br>
                                            <span id = "message2" style="color:red"> </span>
                                    </div>

                                    <div class="mb-3 mb-0 text-center">
                                        <button class="btn btn-primary" type="submit"> Log In </button>
                                    </div>
                                </form>
                            </div> <!-- end card-body -->
                        </div>
                        <!-- end card -->

                    </div> <!-- end col -->
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <!-- end page -->

        <footer class="footer footer-alt">
            2018 - 2021 © Hyper - Coderthemes.com
        </footer>

        <!-- bundle -->
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/vendor.min.js"></script>
        <script src="http://localhost:8080/SIMPEL_Ganjil/assets/js/app.min.js"></script>
    </body>
</html>
