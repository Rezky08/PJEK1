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
public class Alamat1120 {
    private String kelurahan;
    private String kecamatan;
    private String kota;

    public Alamat1120(String kelurahan, String kecamatan, String kota) {
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.kota = kota;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
    
    public String getConstruct(){
        return getClass().getSimpleName()+"(kelurahan= "+kelurahan+","+"kecamatan= "+kecamatan+","+"kota= "+kota+")";
    }
    
  
}
