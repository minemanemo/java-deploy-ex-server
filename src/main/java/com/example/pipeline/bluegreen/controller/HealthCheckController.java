package com.example.pipeline.bluegreen.controller;


import com.example.pipeline.bluegreen.domain.entity.HealthCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping(path = "/health-check")
    public HealthCheck getHealthCheck() {
        HealthCheck healthCheck = new HealthCheck();
        healthCheck.setResult("Good!");
        return healthCheck;
    }
}
