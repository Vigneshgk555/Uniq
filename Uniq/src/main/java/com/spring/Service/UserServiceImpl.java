package com.spring.Service;

import com.spring.Entity.User;
import com.spring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepo;
    @Override
    public void saveoneuser(User user) {
    userRepo.save(user);
    }
}
