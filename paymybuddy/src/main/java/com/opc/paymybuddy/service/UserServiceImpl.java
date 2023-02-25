package com.opc.paymybuddy.service;

import com.opc.paymybuddy.model.User;
import com.opc.paymybuddy.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.security.core.context.SecurityContextHolder;



@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
