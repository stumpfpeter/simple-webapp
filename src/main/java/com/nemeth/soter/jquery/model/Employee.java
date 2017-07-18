package com.nemeth.soter.jquery.model;


import java.util.List;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private List<Phone> phones;

    public Employee(String name, int age, int salary, List<Phone> phones) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
