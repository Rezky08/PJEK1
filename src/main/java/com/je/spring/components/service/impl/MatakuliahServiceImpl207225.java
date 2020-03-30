
package com.je.spring.components.service.impl;
import com.je.spring.components.dao.MatakuliahDao207225;
import com.je.spring.components.service.MatakuliahService207225;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("matakuliahService")
public class MatakuliahServiceImpl207225 implements MatakuliahService207225{
    
    @Autowired
    MatakuliahDao207225 matakuliahDao207225;

    public void insertMatakuliah() {
        matakuliahDao207225.insertMataKuliah();
    }
}
