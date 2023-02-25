package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.Friend;
import com.opc.paymybuddy.repository.FriendRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class FriendServiceImpl implements FriendService {

    private FriendRepository friendRepository;

    public FriendServiceImpl(FriendRepository friendRepository) {
        super();
        this.friendRepository = friendRepository;
    }

    public Friend createFriend (Friend friend) throws Exception{
        Friend friendMail = friendRepository.findByEmail(friend.getEmail());
        if (friendMail == null){
            return friendRepository.save(friend);
        } else {
            throw new Exception("This email exist in database");
        }
    }

    @Override
    public Friend saveFriend (Friend friend){
        return friendRepository.save(friend);
    }


}
