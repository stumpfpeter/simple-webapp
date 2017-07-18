package com.nemeth.soter.jquery.config;

import com.nemeth.soter.jquery.dao.EmployeeDao;
import com.nemeth.soter.jquery.model.Employee;
import com.nemeth.soter.jquery.model.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeDao employeeDao(){
        return new EmployeeDao(new ArrayList<Employee>())
                .addEmployee(new Employee("Joe",33,33000, new ArrayList<Phone>()))
                .addEmployee(new Employee("Bob ",29,13000, new ArrayList<Phone>()))
                .addEmployee(new Employee("Leia ",18,29000, new ArrayList<Phone>()))
                .addEmployee(new Employee("Jack",30,43000, new ArrayList<Phone>()));
    }
}
