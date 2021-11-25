package com.spring.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployees(){
        return "Display the list of employees";
    }

    @GetMapping("/employee/{id}")
    public String getEmployee(@PathVariable("id") Long id){
        return "Fetch data from employees detail for the id is " + id;
    }

    

}
