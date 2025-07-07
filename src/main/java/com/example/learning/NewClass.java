package com.example.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewClass {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
}
