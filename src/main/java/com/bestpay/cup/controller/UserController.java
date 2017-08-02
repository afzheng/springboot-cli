package com.bestpay.cup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "getUsername")
    public String getUsername(String callback){
        return "admin";
    }
}
