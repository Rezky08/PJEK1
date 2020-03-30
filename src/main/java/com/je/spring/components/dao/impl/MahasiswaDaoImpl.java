/*
 @author Ravi Melan
 */
package com.je.spring.components.dao.impl;

import com.je.spring.components.dao.MahasiswaDao;
import org.springframework.stereotype.Repository;

@Repository("mahasiswaDao")

public class MahasiswaDaoImpl implements MahasiswaDao {

    public void insertMahahsiswa() {
        System.out.println("INSERT MAHASISWA");
    }

}
