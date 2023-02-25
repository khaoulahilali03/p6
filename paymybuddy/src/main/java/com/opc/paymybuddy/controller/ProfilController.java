package com.opc.paymybuddy.controller;

import com.opc.paymybuddy.model.User;
import com.opc.paymybuddy.repository.UserRepository;
import com.opc.paymybuddy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfilController {

    private UserService userService;
    private UserRepository userRepository;

    public ProfilController(UserService userService, UserRepository userRepository) {
        super();
        this.userService = userService;
        this.userRepository = userRepository;
    }

}
