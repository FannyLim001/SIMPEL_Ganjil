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
    
    public List pilihLogbook(String id_peminjaman){
        List<Logbook> data = new ArrayList<Logbook>();
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM tbl_logbook\n" +
                "WHERE id_peminjaman = '"+id_peminjaman+"'";
            rs = db.getData(sql);
            while(rs.next()){
                Logbook lb = new Logbook();
                lb.setId_logbook(rs.getInt("id_logbook"));
                lb.setNama_pengisi(rs.getString("nama_pengisi"));
                lb.setTgl_pengisian(rs.getString("tgl_pengisian"));
                lb.setKondisi_lab(rs.getString("kondisi_lab"));
                lb.setPengaduan(rs.getString("pengaduan"));
                lb.setFoto_lab(rs.getString("foto_lab"));
                
                data.add(lb);
            }
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan logbook" + ex);
        }
        return data;
    }
}
