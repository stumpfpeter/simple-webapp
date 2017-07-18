package com.nemeth.soter.jquery.controllers;

import com.nemeth.soter.jquery.dao.EmployeeDao;
import com.nemeth.soter.jquery.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @RequestMapping("/employees")
    public List<Employee> listAllEmployees() {
        return employeeDao.listAllEmployees();
    }
}
