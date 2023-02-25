package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.Account;
import com.opc.paymybuddy.model.Friend;
import com.opc.paymybuddy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> findAll(){return accountRepository.findAll();}

}
