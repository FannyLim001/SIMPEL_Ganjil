package models.pic;

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
}
