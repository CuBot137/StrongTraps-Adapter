package com.java.GCP.StrongTrapsAdapter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrongController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
