package com.opc.paymybuddy.controller;

import com.opc.paymybuddy.model.Account;
import com.opc.paymybuddy.model.Friend;
import com.opc.paymybuddy.model.Transaction;
import com.opc.paymybuddy.model.User;
import com.opc.paymybuddy.service.AccountService;
import com.opc.paymybuddy.service.FriendService;
import com.opc.paymybuddy.service.TransactionService;
import com.opc.paymybuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.event.MouseEvent;
import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    private FriendService friendService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transaction")
    public String showTransferForm(Model model) {
        Transaction transaction = new Transaction();
        model.addAttribute("transaction", transaction);
        return "transaction";
    }

   /* @PostMapping("/transaction")
    public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/home";
    }*/
}
