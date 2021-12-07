package com.example.configmaps.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${example.property.1 : default value}")
    private String prop1;

    @GetMapping
    public String getData(){
        return prop1;
    }
}
