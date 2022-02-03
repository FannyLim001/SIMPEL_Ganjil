package models.pic;

import config.database;

public class Peminjaman {
    database db = null;
    int no_lab, jml_status_peminjaman;
    int id_peminjaman, id_lab, level, id_mhs;
    String tgl_peminjaman, tgl_mulai, tgl_berakhir, keterangan;
    String ketua_kegiatan, kontak_ketua, status_peminjaman;

    public Peminjaman() {
        db = new database();
    }
    
    public database getDb() {
        return db;
    }

    public void setDb(database db) {
        this.db = db;
    }

    public int getNo_lab() {
        return no_lab;
    }

    public void setNo_lab(int no_lab) {
        this.no_lab = no_lab;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId_mhs() {
        return id_mhs;
    }

    public void setId_mhs(int id_mhs) {
        this.id_mhs = id_mhs;
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

    public String getStatus_peminjaman() {
        return status_peminjaman;
    }

    public void setStatus_peminjaman(String status_peminjaman) {
        this.status_peminjaman = status_peminjaman;
    }

    public int getJml_status_peminjaman() {
        return jml_status_peminjaman;
    }

    public void setJml_status_peminjaman(int jml_status_peminjaman) {
        this.jml_status_peminjaman = jml_status_peminjaman;
    }
}