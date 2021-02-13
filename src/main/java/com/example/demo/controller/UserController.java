package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class UserController{
    @Autowired
    UserService userService;

    @GetMapping("*")
    public String error(){
        return "404";
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

}
