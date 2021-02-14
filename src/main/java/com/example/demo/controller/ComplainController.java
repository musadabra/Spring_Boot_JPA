package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComplainController {

    @GetMapping("/admin/complain")
    public String complainsPage(){
        return "admin/complain";
    }
}
