package com.opc.paymybuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionId")
    private int transaction_id;

    @Column(name = "amount")
    private float amount;

    @Column(name = "charge")
    private float charge;

    @Column(name = "date")
    private Date dateOfTransaction;

    @Column(name = "from_accountId")
    private int from_account;

    @Column(name = "to_accountId")
    private int to_account;

    @Column(name = "transacted")
    private boolean transacted;

    @Column(name = "description")
    private String description;
}
