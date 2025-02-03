package com.example.rest_service;

//import java.util.List;

public class EmployeeManager {

    Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.getEmployee_list().add(new Employee(9391234,"shiva","reddy","shivareddy@gmail.com","software developer 2"));
        employees.getEmployee_list().add(new Employee(8291234,"pranadh","vududala","pranadhvududala@gmail.com","software developer 1"));
        employees.getEmployee_list().add(new Employee(7281234,"sony","thaviti","sonythatviti@gmail.com","quality assurance engineer"));
        employees.getEmployee_list().add(new Employee(6281234,"sudheer","konda","sudheerkonda@gmail.com","data analyst "));
    }
    public Employees getEmployees(){
        return this.employees;
    }
}
