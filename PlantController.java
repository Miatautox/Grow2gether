package com.grow2gether.plantservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
