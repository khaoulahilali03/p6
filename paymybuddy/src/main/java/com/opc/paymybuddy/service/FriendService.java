package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.Friend;

public interface FriendService {

    Friend createFriend(Friend friend) throws Exception;
    Friend saveFriend(Friend friend);
}
