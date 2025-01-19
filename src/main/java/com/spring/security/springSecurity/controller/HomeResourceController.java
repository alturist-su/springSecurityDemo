package com.spring.security.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    @GetMapping("/")
    public String getHome(){
        return ("<h1> Welcome Home. . .  . . .  </h1>");
    }
}
