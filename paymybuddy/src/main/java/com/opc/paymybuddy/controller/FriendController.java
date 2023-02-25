package com.opc.paymybuddy.controller;

import com.opc.paymybuddy.model.Account;
import com.opc.paymybuddy.model.Friend;
import com.opc.paymybuddy.model.User;
import com.opc.paymybuddy.service.AccountService;
import com.opc.paymybuddy.service.FriendService;
import com.opc.paymybuddy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FriendController {

    public FriendService friendService;
    public UserService userService;
    public AccountService accountService;

    public FriendController(FriendService friendService, UserService userService, AccountService accountService) {
        super();
        this.userService = userService;
        this.friendService = friendService;
        this.accountService = accountService;
    }

    private Account account() {return new Account(); }

    @GetMapping("/connection")
    public String showConnectionForm(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        Friend friend = new Friend();
        model.addAttribute("friend",friend);
        return "connection";
    }

   @PostMapping("/transaction")
    public String saveFriend (@ModelAttribute("friend") Friend friend){
        friendService.saveFriend(friend);
        return "redirect:/transaction";
    }



}
