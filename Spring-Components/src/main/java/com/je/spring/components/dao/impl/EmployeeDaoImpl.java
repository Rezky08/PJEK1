
package com.je.spring.components.dao.impl;
import com.je.spring.components.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ravi Melan
 */
@Repository("employeeDao")

public class EmployeeDaoImpl implements EmployeeDao {
    
    public void insertEmployee() {
        System.out.println("INSERT EMPLOYEE");
    }

   
}
