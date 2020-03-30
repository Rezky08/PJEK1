/*
 @author Ravi Melan
 */
package com.je.spring.components.service.impl;

import com.je.spring.components.dao.MahasiswaDao;
import com.je.spring.components.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mahasiswaService")
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    MahasiswaDao mahasiswaDao;

    public void insertMahasiswa() {
        mahasiswaDao.insertMahahsiswa();
    }
}
