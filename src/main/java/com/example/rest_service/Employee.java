package com.example.rest_service;

public class Employee {
    private long employe_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee(long employe_id,String first_name,String last_name,String email,String title) {
        this.employe_id = employe_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.title=title;
    }

    public long getEmploye_id() {
        return employe_id;
    }
    public String getFirst_name(){
        return this.first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }
}
