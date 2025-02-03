package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    //Employees serve=new EmployeeManager();

    EmployeeManager serve = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getEmployeeList(){
        return serve.getEmployees();
    }
}
