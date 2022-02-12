<%-- 
    Document   : laporan_peminjamanXLSX
    Created on : Feb 9, 2022, 1:38:52 PM
    Author     : FANNY
--%>

<%@page import="java.io.*,java.sql.*"%>
<%@page import="config.database"%>
<%@page import="org.apache.poi.ss.usermodel.*"%>
<%@page import="org.apache.poi.xssf.usermodel.*"%>
<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "attachment; filename=LaporanPeminjaman.xlsx");
    
    if(session.getAttribute("username")==null){
     response.sendRedirect("login.jsp");
    } else {
    
    database db = new database();
    db.connection();
    ResultSet rs = null;
        
    String sql = "select l.no_lab, p.level, date(p.tgl_peminjaman), date(p.tgl_mulai), "
                + "date(p.tgl_berakhir), p.keterangan, m.nama_mhs, m.kontak_mhs, p.status_peminjaman "
                + "from tbl_peminjaman p, tbl_lab l, tbl_mahasiswa m where p.id_lab = l.id_lab and "
                + "p.id_mhs = m.id_mhs and level between 2 and 3 and status_peminjaman != 'Diajukan'";
        
    rs = db.getData(sql);
        
        
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet = wb.createSheet("Data Peminjaman");
    
    // create excel
    // header
    int rowNo = 0;
    Row row = sheet.createRow(rowNo++);
    int cellnum = 0;
    Cell cell;
    cell = row.createCell(cellnum++);
    cell.setCellValue("Lab");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Level");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Tanggal Peminjaman");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Tanggal Mulai");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Tanggal Berakhir");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Keterangan");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Ketua Kegiatan");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Kontak Ketua");
    
    cell = row.createCell(cellnum++);
    cell.setCellValue("Status");
    
    // details
    while(rs.next()){
        cellnum = 0;
        row = sheet.createRow(rowNo++);
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(1));

        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(2));

        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(3));

        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(4));
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(5));
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(6));
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(7));
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(8));
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(rs.getString(9));
    }
    // end of excel
    
    wb.write(response.getOutputStream());
    wb.close();
}
%>
