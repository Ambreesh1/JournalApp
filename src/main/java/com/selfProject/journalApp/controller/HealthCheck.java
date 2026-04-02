package com.selfProject.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {                                              //to see the server is properly working
    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }
}


