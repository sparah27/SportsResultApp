package com.Application.SportsResult.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SportsResultController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, User!";
    }
}