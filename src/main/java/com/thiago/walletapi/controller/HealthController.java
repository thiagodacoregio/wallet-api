package com.thiago.walletapi.controller;


import com.thiago.walletapi.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public HealthResponse health() {
        LocalDateTime now = LocalDateTime.now();
        return new HealthResponse("UP", now);
    }
}
