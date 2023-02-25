package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.Transaction;
import com.opc.paymybuddy.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    public TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        super();
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }
}
