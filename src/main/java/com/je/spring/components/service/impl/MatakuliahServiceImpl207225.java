
package com.je.spring.components.service.impl;
import com.je.spring.components.service.MatakuliahService207225;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("matakuliahService")
public class MatakuliahServiceImpl207225 implements MatakuliahService207225{
    
    @Autowired
    MatakuliahDao matakuliahDao;

    public void insertMatakuliah() {
        matakuliahDao.insertMatakuliah();
    }
}
