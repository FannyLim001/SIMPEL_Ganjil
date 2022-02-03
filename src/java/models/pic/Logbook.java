package models.pic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class Logbook {
    database db = null;
    int id_logbook;
    String nama_pengisi, tgl_pengisian, kondisi_lab, pengaduan, foto_lab;
    
    public Logbook(){
        db = new database();
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    public int getId_logbook() {
        return id_logbook;
    }

    public void setId_logbook(int id_logbook) {
        this.id_logbook = id_logbook;
    }

    public String getNama_pengisi() {
        return nama_pengisi;
    }

    public void setNama_pengisi(String nama_pengisi) {
        this.nama_pengisi = nama_pengisi;
    }

    public String getTgl_pengisian() {
        return tgl_pengisian;
    }

    public void setTgl_pengisian(String tgl_pengisian) {
        this.tgl_pengisian = tgl_pengisian;
    }

    public String getKondisi_lab() {
        return kondisi_lab;
    }

    public void setKondisi_lab(String kondisi_lab) {
        this.kondisi_lab = kondisi_lab;
    }

    public String getPengaduan() {
        return pengaduan;
    }

    public void setPengaduan(String pengaduan) {
        this.pengaduan = pengaduan;
    }

    public String getFoto_lab() {
        return foto_lab;
    }

    public void setFoto_lab(String foto_lab) {
        this.foto_lab = foto_lab;
    }
    
    public Logbook logbookByPeminjaman(int id_lab, String tgl_berakhir){
        Logbook lb = new Logbook();
        try{
            String sql = "SELECT * FROM tbl_logbook\n" +
                "WHERE tgl_pengisian = \""+tgl_berakhir+"\"\n" +
                "AND id_lab = "+id_lab+"";
            ResultSet rs = db.getData(sql);
            if(rs.next()){
                lb.setId_logbook(rs.getInt("id_logbook"));
                lb.setNama_pengisi(rs.getString("nama_pengisi"));
                lb.setTgl_pengisian(rs.getString("tgl_pengisian"));
                lb.setKondisi_lab(rs.getString("kondisi_lab"));
                lb.setPengaduan(rs.getString("pengaduan"));
                lb.setFoto_lab(rs.getString("foto_lab"));
            }
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan logbook" + ex);
        }
        return lb;
    }
    
//    public static void main(String[] args) {
//        Logbook log = new Logbook();
//        log = log.logbookByPeminjaman(7, "03-02-2022");
//        System.out.println(log.getNama_pengisi());
//    }
}