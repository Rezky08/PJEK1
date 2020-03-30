/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.basic.app;

import com.je.spring.basic.model.Mahasiswa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author white
 */
public class ApplicationContextApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//      Setter & Getter
        Mahasiswa mahasiswa = (Mahasiswa) context.getBean("mahasiswa2");
        System.out.println("--------Setter & Getter--------");
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Jurusan : " + mahasiswa.getJurusan());
        System.out.println("Tempat Lahir: " + mahasiswa.getTmptLahir());

    }
}
