/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.je.spring.components.service.impl;

import com.je.spring.components.dao.CustomerDao;
import com.je.spring.components.dao.EmployeeDao;
import com.je.spring.components.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ravi Melan
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    EmployeeDao employeeDao;
    public void setEmployee(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    public void insertEmployee() {
        employeeDao.insertEmployee();
    }
}
