package io.github.rajeshcse1721.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/heath-check")
    public String healthCheck(){
        return "Its Up and running...";
    }
}
