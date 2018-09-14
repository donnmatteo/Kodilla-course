package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompany(final String companyPartName) {
        try {
            LOGGER.info("Finished searching company");
            return companyDao.findCompanyWithLetters(companyPartName);
        } catch (Exception e) {
            LOGGER.info("Error" + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> findEmployee(final String employeePartName) {
        try {
            LOGGER.info("Finished searching employee");
            return employeeDao.findEmployeeWithLetters(employeePartName);
        } catch (Exception e) {
            LOGGER.info("Error" + e.getMessage());
            return new ArrayList<>();
        }
    }
}
