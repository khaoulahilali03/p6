package com.opc.paymybuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountId")
    private int account_id;

    @Column(name = "iban")
    private String  iban;

    @Column(name = "solde")
    private float solde;

    @OneToMany(
            mappedBy = "account",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Transaction> transactionList = new ArrayList<>();

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "friendId")
    private Friend friend;

}
