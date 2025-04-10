package com.example.tea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teacup/")
public class HomeController {

    @GetMapping("home")
    public String home() {
        return "Index";
    }
}
