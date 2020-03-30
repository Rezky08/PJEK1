/*
 @author Ravi Melan
 */
package com.je.spring.components.service.impl;

import com.je.spring.components.dao.CustomerDao;
import com.je.spring.components.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void insertCustomer() {
        customerDao.insertCustomer();
    }
}
