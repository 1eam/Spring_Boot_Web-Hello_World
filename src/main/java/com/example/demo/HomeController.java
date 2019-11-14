package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeComtroller {
    @GetMapping("/home")
    public String home(){
        return "<li>Hello World</li>";
    }
}
