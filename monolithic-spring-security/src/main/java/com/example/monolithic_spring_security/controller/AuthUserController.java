package com.example.monolithic_spring_security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monolithic_spring_security.entity.AuthUser;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/authusers")
public class AuthUserController {

    @PostMapping("/validate")
    public AuthUser validate(@RequestBody AuthUser user) {

        return null;
    }

}
