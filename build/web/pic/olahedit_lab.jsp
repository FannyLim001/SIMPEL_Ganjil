<%-- 
    Document   : simpan_lab
    Created on : Feb 6, 2022, 1:25:31 PM
    Author     : andre
--%>

<%@page import="models.pic.*"%>
<%@page import="controllers.pic.*"%>
<jsp:useBean id="PicController" class="controllers.pic.PicController" />
<jsp:useBean id="Lab" class="models.pic.InformasiLab" />
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id_lab = Integer.parseInt(request.getParameter("id_lab"));
    String nama_lab = request.getParameter("nama_lab");
    int no_lab = Integer.parseInt(request.getParameter("no_lab"));
    int kapasitas_lab = Integer.parseInt(request.getParameter("kapasitas_lab"));
    int id_pic = Integer.parseInt(request.getParameter("id_pic"));
    int id_kalab = Integer.parseInt(request.getParameter("id_kalab"));
    String foto_lab = request.getParameter("foto_lab");
    String status_lab = request.getParameter("status_lab");
    
    Lab.setId_lab(id_lab);
    Lab.setNama_lab(nama_lab);
    Lab.setNo_lab(no_lab);
    Lab.setKapasitasLab(kapasitas_lab);
    Lab.setId_pic(id_pic);
    Lab.setId_kalab(id_kalab);
    Lab.setFoto_lab(foto_lab);
    Lab.setStatus(status_lab);
    
//    out.print(Lab.getId_lab() + "<br>");
//    out.print(Lab.getNama_lab()+ "<br>");
//    out.print(Lab.getNo_lab()+ "<br>");
//    out.print(Lab.getKapasitasLab()+ "<br>");
//    out.print(Lab.getId_pic()+ "<br>");
//    out.print(Lab.getId_kalab()+ "<br>");
//    out.print(Lab.getFoto_lab()+ "<br>");
//    out.print(Lab.getStatus()+ "<br>");
    
    int update = PicController.updateDataLab(Lab);
    if (update > 0) {
        request.setAttribute("proses_lab", "berhasil");
    }else{
        request.setAttribute("proses_lab", "gagal");
    }
    request.getRequestDispatcher("/pic/daftar_lab.jsp").forward(request, response);
%>