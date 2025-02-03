package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeManager serve = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getEmployeeList(){

        return serve.getEmployees();
    }


    @PostMapping("/employees")
    public String addemployes(@RequestBody Employee emp){
        serve.addemployee(emp);
        return "Data added successfully,now you can check the updated list";
    }
}
