package com.frankmoley.lil.adminweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(Model model){
        return "login";
    }
}
