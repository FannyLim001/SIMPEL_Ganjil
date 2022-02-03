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
public class KalabModel {
    
    private int id_kalab;
    private String nama_kalab;
    private String email_kalab;
    private String pass_kalab;

    public int getId_kalab() {
        return id_kalab;
    }

    public void setId_kalab(int id_kalab) {
        this.id_kalab = id_kalab;
    }

    public String getNama_kalab() {
        return nama_kalab;
    }

    public void setNama_kalab(String nama_kalab) {
        this.nama_kalab = nama_kalab;
    }
    
    public String getEmail_kalab() {
        return email_kalab;
    }
    
    public void setEmail_kalab(String email_kalab) {
        this.email_kalab = email_kalab;
    }
    
    public String getPass_kalab() {
        return pass_kalab;
    }
    
    public void setPass_kalab(String pass_kalab) {
        this.pass_kalab = pass_kalab;
    }
}
