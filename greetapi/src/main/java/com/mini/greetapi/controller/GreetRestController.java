package com.mini.greetapi.controller;

import com.mini.greetapi.client.WelcomeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    private WelcomeApiClient welcomeApiClient;

    @GetMapping("/greet")
    public String getGreetMsg(){
        String greetMsg = "Good morning..!!";
        String welcomeMsg = welcomeApiClient.invokeHealthCheck();
        return greetMsg + welcomeMsg;
    }
}
