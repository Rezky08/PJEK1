/*
 @author Ravi Melan
 */
package com.je.spring.components.dao.impl;

import com.je.spring.components.dao.CustomerDao;
import org.springframework.stereotype.Repository;

@Repository("customerDao")

public class CustomerDaoImpl implements CustomerDao{

    public void insertCustomer() {
        System.out.println("INSERT CUSTOMER");
    }
}
