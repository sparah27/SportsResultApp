package com.Application.SportsResult.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Team")
public class TeamController {
    @GetMapping
    public String team(){
        return team();
    }
}
