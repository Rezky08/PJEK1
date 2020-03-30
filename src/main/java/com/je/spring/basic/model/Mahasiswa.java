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
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private String TmptLahir;

    public String getTmptLahir() {
        return TmptLahir;
    }

    public void setTmptLahir(String TmptLahir) {
        this.TmptLahir = TmptLahir;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}
