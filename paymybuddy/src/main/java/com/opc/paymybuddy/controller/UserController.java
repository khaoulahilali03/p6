package com.opc.paymybuddy.controller;

import com.opc.paymybuddy.model.User;
import com.opc.paymybuddy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "registration";
    }

    @PostMapping("/registration")
    public String saveUser (@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/login";
    }


}
