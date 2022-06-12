package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.usertype.LoggableUserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void findCompany() {
        Employee employee = new Employee("aaaa", "aaaa");
        Company company = new Company("bbbb");
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);
        companyDao.save(company);

        List<Company> companyList = new ArrayList<>();
        companyList.add(company);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        List<Company> result = facade.companyList("bbb");

        Assertions.assertEquals(6, result.size());

        companyDao.delete(company);
    }

    @Test
    public void findEmployee() {
        Employee employee = new Employee("aaaaa", "aaaaa");
        Company company = new Company("bbbb");
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);
        companyDao.save(company);
        employeeDao.save(employee);

        List<Company> companyList = new ArrayList<>();
        companyList.add(company);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        List<Employee> result = facade.employeeList("aaa");

        Assertions.assertEquals(7, result.size());

        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}

