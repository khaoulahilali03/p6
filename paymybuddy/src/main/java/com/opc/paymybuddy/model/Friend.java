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
@Table(name = "friend")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friendId")
    private int friend_id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "iban")
    private String iban;

    @ManyToOne(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(
            mappedBy = "friend",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Account> accountList = new ArrayList<>();
}
