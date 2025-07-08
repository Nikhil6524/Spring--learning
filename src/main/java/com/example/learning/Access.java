package com.example.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Access {

    @Autowired
    private Dog dog;

    @GetMapping("/dog")
    public String getDogSound() {
        return dog.fun();
    }
}
