/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.kalab;

/**
 *
 * @author FANNY
 */
public class LabModel {
    int id_lab, id_pic, id_kalab, no_lab;
    String nama_lab, kapasitas_lab, foto_lab, status_lab;

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public int getId_pic() {
        return id_pic;
    }

    public void setId_pic(int id_pic) {
        this.id_pic = id_pic;
    }

    public int getId_kalab() {
        return id_kalab;
    }

    public void setId_kalab(int id_kalab) {
        this.id_kalab = id_kalab;
    }

    public int getNo_lab() {
        return no_lab;
    }

    public void setNo_lab(int no_lab) {
        this.no_lab = no_lab;
    }

    public String getNama_lab() {
        return nama_lab;
    }

    public void setNama_lab(String nama_lab) {
        this.nama_lab = nama_lab;
    }

    public String getKapasitas_lab() {
        return kapasitas_lab;
    }

    public void setKapasitas_lab(String kapasitas_lab) {
        this.kapasitas_lab = kapasitas_lab;
    }

    public String getFoto_lab() {
        return foto_lab;
    }

    public void setFoto_lab(String foto_lab) {
        this.foto_lab = foto_lab;
    }

    public String getStatus_lab() {
        return status_lab;
    }

    public void setStatus_lab(String status_lab) {
        this.status_lab = status_lab;
    }
        
}
