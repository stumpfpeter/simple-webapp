package com.nemeth.soter.jquery.dao;

import com.nemeth.soter.jquery.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private List<Employee> employees;

    public EmployeeDao(List<Employee> employees) {
        this.employees = new ArrayList<Employee>();
    }

    public List<Employee> listAllEmployees() {
        return employees;
    }

    public EmployeeDao addEmployee(Employee employee){
        employees.add(employee);
        return this;
    }
}
