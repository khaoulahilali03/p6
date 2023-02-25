package com.opc.paymybuddy.repository;

import com.opc.paymybuddy.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend,Integer> {

    public Friend findByEmail(String email);
}
