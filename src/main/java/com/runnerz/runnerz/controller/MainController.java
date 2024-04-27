package com.runnerz.runnerz.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {
    @GetMapping("/")
    Object home(){
        return "Runnerz Home Page!";
    }
}
