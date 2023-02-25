package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.Transaction;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);
}
