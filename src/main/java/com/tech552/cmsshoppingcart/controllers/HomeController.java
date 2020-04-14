package com.tech552.cmsshoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/someRandomPage")
    public String hone(){
        return "home";  //return a home view file
    }
}
