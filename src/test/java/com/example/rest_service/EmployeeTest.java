package com.example.rest_service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void EmployeeTestConstructor(){
        Employee emp=new Employee(374888,"shiva","reddy","shivareddy@gmail.com","software developer");
        assertEquals("shiva",emp.getFirst_name());
        assertEquals("shivareddy@gmail.com",emp.getEmail());

    }

}
