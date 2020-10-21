package com.example.lesson22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "main";
    }
}
