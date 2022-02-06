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
public class DashboardModel {
    private int total_peminjaman, total_disetujui, total_ditolak, total_lab;
   
    public int getTotal_peminjaman() {
        return total_peminjaman;
    }

    public void setTotal_peminjaman(int total_peminjaman) {
        this.total_peminjaman = total_peminjaman;
    }

    public int getTotal_disetujui() {
        return total_disetujui;
    }

    public void setTotal_disetujui(int total_disetujui) {
        this.total_disetujui = total_disetujui;
    }

    public int getTotal_ditolak() {
        return total_ditolak;
    }

    public void setTotal_ditolak(int total_ditolak) {
        this.total_ditolak = total_ditolak;
    }
    
    public int getTotal_lab() {
        return total_lab;
    }

    public void setTotal_lab(int total_lab) {
        this.total_lab = total_lab;
    }
}
