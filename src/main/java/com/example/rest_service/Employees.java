package com.example.rest_service;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    List<Employee> employee_list;
    public Employees(){
        employee_list=new ArrayList<>();
    }

    public List<Employee> getEmployee_list(){
        return this.employee_list;
    }


//    public void setEmployee_list(Employee ls){
//        this.employee_list=ls;
//    }


}
