package com.java.GCP.StrongTrapsAdapter.controller;

import com.java.GCP.StrongTrapsAdapter.model.TestModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrongController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @PostMapping("/test-json")
    public ResponseEntity<String> receiveTestData(@RequestBody TestModel testModel){
        String name = testModel.getName();
        int age = testModel.getAge();
        System.out.println("Received test data: Name="+name+", Age="+age);
        return new ResponseEntity<>("Person data received successfully", HttpStatus.OK);
    }
}
