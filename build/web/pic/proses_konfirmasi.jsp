<!-- Models -->
<%@page import="models.pic.Peminjaman" %>

<!-- Controllers -->
<%@page import="controllers.pic.PicController" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    String aksi = request.getParameter("aksi");
    
    PicController pc = new PicController();
    int doConfirm = pc.konfirmasiPeminjaman(id, aksi);
    if (doConfirm > 0) {
        request.setAttribute("save_data", "berhasil");
    }else{
        request.setAttribute("save_data", "gagal");
    }
    
    request.getRequestDispatcher("/pic/mengkonfirmasi_peminjaman.jsp").forward(request, response);
%>