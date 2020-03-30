/*
 @author Ravi Melan
 */
package com.je.spring.components.app;

import com.je.spring.components.model.Customer;
import com.je.spring.components.model.Employee;
import com.je.spring.components.model.Mahasiswa;
import com.je.spring.components.model.Matakuliah207225;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.je.spring.components.service.CustomerService;
import com.je.spring.components.service.EmployeeService;
import com.je.spring.components.service.MahasiswaService;
import com.je.spring.components.service.MatakuliahService207225;

public class AppTugas {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        Customer customer = new Customer();
        customer.setId(1);;
        customer.setNama("Ravi Melan");
        customer.setAlamat("Sarana Indah Permai");
        System.out.println("Start Insert Customer");
        customerService.insertCustomer();
        System.out.println("Finish Insert Customer");

        System.out.println("Customer id: " + customer.getId());
        System.out.println("Customer Nama: " + customer.getNama());
        System.out.println("Customer Alamat: " + customer.getAlamat());

        System.out.println("-------------------------");

        MahasiswaService mahasiswaService = (MahasiswaService) context.getBean("mahasiswaService");
        mahasiswaService.insertMahasiswa();
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(1);;
        mahasiswa.setNama("Ravi Melan");
        mahasiswa.setAlamat("Sarana Indah Permai");
        System.out.println("Start Insert Mahasiswa");
        mahasiswaService.insertMahasiswa();
        System.out.println("Finish Insert Mahasiswa");

        System.out.println("Mahasiswa id: " + mahasiswa.getId());
        System.out.println("Mahasiswa Nama: " + mahasiswa.getNama());
        System.out.println("Mahasiswa Alamat: " + mahasiswa.getAlamat());

        System.out.println("-------------------------");

        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        employeeService.insertEmployee();
        Employee employee = new Employee();
        employee.setId(1);;
        employee.setNama("Ravi Melan");
        employee.setAlamat("Sarana Indah Permai");
        System.out.println("Start Insert Employee");
        employeeService.insertEmployee();
        System.out.println("Finish Insert Employee");

        System.out.println("Employee id: " + employee.getId());
        System.out.println("Employee Nama: " + employee.getNama());
        System.out.println("Employee Alamat: " + employee.getAlamat());

        System.out.println("-------------------------");

        MatakuliahService207225 matakuliahService207225 = (MatakuliahService207225) context.getBean("mataKuliahService");
        matakuliahService207225.insertMatakuliah();
        Matakuliah207225 mataKuliah = new Matakuliah207225();
        mataKuliah.setKodeMatkul207225(1);;
        mataKuliah.setNamaMatkul207225("Java Enterprise");
        System.out.println("Start Insert Mata Kuliah");
        matakuliahService207225.insertMatakuliah();
        System.out.println("Finish Insert Mata Kuliah");

        System.out.println("Kode Mata Kuliah: " + mataKuliah.getKodeMatkul207225());
        System.out.println("Nama Mata Kuliah: " + mataKuliah.getNamaMatkul207225());
    }
}
