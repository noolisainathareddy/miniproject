package com.mini.welcomeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/healthcheck")
    public String health(){
        return "This is Welcome API";
    }
}
