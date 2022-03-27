package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Marker Annotation - Am Here marking this class as "Controller"
public class EmployeeController
{
    // Global declaration of variables (Scope throughout the Class)
    private String homePage = null;

    public EmployeeController()
    {
        // Initialising the variables inside the constructor
        homePage = "home";
    }

    @GetMapping("/")
    public String homePage()
    {
        return homePage;
    }
}
