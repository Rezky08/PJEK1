/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.basic.model;

/**
 *
 * @author white
 */
public class MataKuliah1120 {
    private String kode1120;
    private String nama1120;
    private Mahasiswa mahasiswa;

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public String getKode1120() {
        return kode1120;
    }

    public void setKode1120(String kode1120) {
        this.kode1120 = kode1120;
    }


    public String getNama1120() {
        return nama1120;
    }

    public void setNama1120(String nama1120) {
        this.nama1120 = nama1120;
    }

  
}
