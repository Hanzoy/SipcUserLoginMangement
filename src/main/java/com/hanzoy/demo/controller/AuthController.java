package com.hanzoy.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login/{password}")
    public String login(@PathVariable String password){
        return password;
    }
}
