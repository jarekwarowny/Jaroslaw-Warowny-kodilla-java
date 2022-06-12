package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> companyList(String company) {
        return companyDao.retriveCompany(company);
    }

    public List<Employee> employeeList(String employee) {
        return employeeDao.retriveEmployee(employee);
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
