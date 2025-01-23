package com.spring.security.springSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    @GetMapping("/")
    public String getHome(HttpServletRequest request){
        return ("<h1> Welcome Home. . .  . . .  </h1>"+request.getSession().getId());
    }
}
