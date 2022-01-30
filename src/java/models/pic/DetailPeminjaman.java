package models.pic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import config.database;

public class DetailPeminjaman {
    database db = null;
    int id_peminjaman, level;
    String ketua_kegiatan, kontak_ketua, no_lab, tgl_peminjaman;
    String tgl_mulai, tgl_berakhir, keterangan;
    
    public DetailPeminjaman(){
        db = new database();
    }

    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getKetua_kegiatan() {
        return ketua_kegiatan;
    }

    public void setKetua_kegiatan(String ketua_kegiatan) {
        this.ketua_kegiatan = ketua_kegiatan;
    }

    public String getKontak_ketua() {
        return kontak_ketua;
    }

    public void setKontak_ketua(String kontak_ketua) {
        this.kontak_ketua = kontak_ketua;
    }

    public String getNo_lab() {
        return no_lab;
    }

    public void setNo_lab(String no_lab) {
        this.no_lab = no_lab;
    }

    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public String getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public String getTgl_berakhir() {
        return tgl_berakhir;
    }

    public void setTgl_berakhir(String tgl_berakhir) {
        this.tgl_berakhir = tgl_berakhir;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public List tampilDetailPeminjaman(String id_peminjaman){
        List<DetailPeminjaman> data = new ArrayList<DetailPeminjaman>();
        ResultSet rs = null;
        try{
            String sql = "SELECT p.id_peminjaman, l.no_lab, p.level, p.ketua_kegiatan,\n" +
                "p.kontak_ketua, p.tgl_peminjaman, p.tgl_mulai, p.tgl_berakhir, p.keterangan\n" +
                "FROM tbl_peminjaman p, tbl_lab l\n" +
                "WHERE p.id_lab = l.id_lab AND p.id_peminjaman = '"+id_peminjaman+"'";
            rs = db.getData(sql);
            while(rs.next()){
                DetailPeminjaman dp = new DetailPeminjaman();
                dp.setId_peminjaman(rs.getInt("id_peminjaman"));
                dp.setNo_lab(rs.getString("no_lab"));
                dp.setLevel(rs.getInt("level"));
                dp.setKetua_kegiatan(rs.getString("ketua_kegiatan"));
                dp.setKontak_ketua(rs.getString("kontak_ketua"));
                dp.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                dp.setTgl_mulai(rs.getString("tgl_mulai"));
                dp.setTgl_berakhir(rs.getString("tgl_berakhir"));
                dp.setKeterangan(rs.getString("keterangan"));
                
                data.add(dp);
            }
            db.disconnect(rs);
        }catch(Exception ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan detail peminjaman" + ex);
        }
        return data;
    }
}