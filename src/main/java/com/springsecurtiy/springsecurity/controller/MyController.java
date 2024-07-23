package com.springsecurtiy.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @PreAuthorize("hasRole('USER')") // defining role comming from SecurityConfig userDetailsService method.
    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello User";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello Admin";
    }

}
