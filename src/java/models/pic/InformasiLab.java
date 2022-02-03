package models.pic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class InformasiLab {
    database db = null;
    int id_lab, jml_lab, lab_tersedia;
    String no_lab, nama_lab, kapasitas, ketua_lab, pic_lab, foto_lab, status;
    
    public InformasiLab(){
        db = new database();
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getNo_lab() {
        return no_lab;
    }

    public void setNo_lab(String no_lab) {
        this.no_lab = no_lab;
    }

    public String getNama_lab() {
        return nama_lab;
    }

    public void setNama_lab(String nama_lab) {
        this.nama_lab = nama_lab;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getKetua_lab() {
        return ketua_lab;
    }

    public void setKetua_lab(String ketua_lab) {
        this.ketua_lab = ketua_lab;
    }

    public String getPic_lab() {
        return pic_lab;
    }

    public void setPic_lab(String pic_lab) {
        this.pic_lab = pic_lab;
    }

    public String getFoto_lab() {
        return foto_lab;
    }

    public void setFoto_lab(String foto_lab) {
        this.foto_lab = foto_lab;
    }

    public int getJml_lab() {
        return jml_lab;
    }

    public void setJml_lab(int jml_lab) {
        this.jml_lab = jml_lab;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLab_tersedia() {
        return lab_tersedia;
    }

    public void setLab_tersedia(int lab_tersedia) {
        this.lab_tersedia = lab_tersedia;
    }
    
    public InformasiLab labTersedia(){
        InformasiLab info = new InformasiLab();
        try{
            String sql = "SELECT COUNT(id_lab) as jml_seluruh_lab, (\n" +
                "    SELECT COUNT(id_lab) \n" +
                "    FROM tbl_lab \n" +
                "    WHERE status_lab LIKE \"Available\") as jml_lab_tersedia\n" +
                "FROM tbl_lab";
            ResultSet rs = db.getData(sql);
            if(rs.next()){
                info.setJml_lab(rs.getInt("jml_seluruh_lab"));
                info.setLab_tersedia(rs.getInt("jml_lab_tersedia"));
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        
        return info;
    }
    
    public InformasiLab labById(String id_peminjaman){
        InformasiLab info = new InformasiLab();
        try{
            String sql = "SELECT l.no_lab, l.nama_lab, l.kapasitas_lab, ka.nama_kalab,\n" + 
                "pic.nama_pic, l.foto_lab\n" +
                "FROM tbl_lab l, tbl_kepala_lab ka, tbl_pic_lab pic, tbl_peminjaman p\n" +
                "WHERE l.id_kalab = ka.id_kalab AND l.id_pic = pic.id_pic\n" +
                "AND p.id_lab = l.id_lab AND p.id_peminjaman = '"+id_peminjaman+"'";
            ResultSet rs = db.getData(sql);
            if(rs.next()){
                info.setNo_lab(rs.getString("no_lab"));
                info.setNama_lab(rs.getString("nama_lab"));
                info.setKapasitas(rs.getString("kapasitas_lab"));
                info.setKetua_lab(rs.getString("nama_kalab"));
                info.setPic_lab(rs.getString("nama_pic"));
                info.setFoto_lab(rs.getString("foto_lab"));
            }
            db.disconnect(rs);
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        }
        return info;
    }
    
//    public static void main(String[] args) {
//        InformasiLab info = new InformasiLab();
//        info = info.labById("2");
//        System.out.println(info.getNama_lab());
//    }
}
