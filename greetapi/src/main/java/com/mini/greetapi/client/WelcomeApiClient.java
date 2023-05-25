package com.mini.greetapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "WELCOME-API")
public interface WelcomeApiClient {

    @GetMapping("/healthcheck")
    public String invokeHealthCheck();

}
