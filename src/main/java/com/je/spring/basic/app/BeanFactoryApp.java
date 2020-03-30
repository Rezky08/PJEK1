/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.basic.app;
import com.je.spring.basic.model.Alamat1120;
import com.je.spring.basic.model.Mahasiswa;
import com.je.spring.basic.model.MataKuliah1120;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



/**
 *
 * @author white
 */
public class BeanFactoryApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        
//      Setter & Getter
        Mahasiswa mahasiswa = (Mahasiswa) factory.getBean("mahasiswa2");
        System.out.println("--------Setter & Getter--------");
        System.out.println("NIM : "+ mahasiswa.getNim());
        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("Jurusan : "+ mahasiswa.getJurusan());
        System.out.println("Tempat Lahir : "+ mahasiswa.getTmptLahir());
        System.out.println("--------Setter & Getter References--------");

        MataKuliah1120 matakuliah = (MataKuliah1120) factory.getBean("matakuliah2");
        System.out.println("Kode Mata Kuliah : "+ matakuliah.getKode1120());
        System.out.println("Nama Mata Kuliah : "+ matakuliah.getNama1120());
        System.out.println("NIM : "+ matakuliah.getMahasiswa().getNim());
        System.out.println("Nama : "+ matakuliah.getMahasiswa().getNama());
        System.out.println("Jurusan : "+ matakuliah.getMahasiswa().getJurusan());
        System.out.println("Tempat Lahir : "+ matakuliah.getMahasiswa().getTmptLahir());
        
        System.out.println("--------Constructor--------");
        Alamat1120 alamat = (Alamat1120) factory.getBean("alamat2");
        System.out.println("Tempat Lahir : "+ alamat.getConstruct());


    }
}
