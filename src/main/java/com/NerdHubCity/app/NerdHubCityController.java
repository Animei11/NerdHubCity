package com.nerdhubcity.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NerdHubCityController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from NerdHubCity 🚀";
    }
}
