package com.example.demo.lesson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DenoController {
    @RequestMapping("/demo")
    public String index() {
        return "Hello world 2 ";
    }
}
