package com.arrisdev.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/studentFallback")
    public String studentServiceFallbackMethod(){
        return "student service is taking longer than expected." +
                "Please come back later.";
    }

    @GetMapping("/departmentFallback")
    public String departmentServiceFallbackMethod(){
        return "department service is taking longer than expected." +
                "Please come back later.";
    }
}
