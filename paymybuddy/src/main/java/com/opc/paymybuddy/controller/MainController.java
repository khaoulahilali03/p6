package com.opc.paymybuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){ return "login";}

    @GetMapping("/home")
    public String menu(){return "home";}

    @GetMapping("/logoff")
    public String logoffPage(){ return "redirect:/login?logoff";}
}
