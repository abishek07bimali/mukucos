package com.example.cosmetic.Services.Impl;

import com.example.cosmetic.Entity.User;
import com.example.cosmetic.Pojo.UserPojo;
import com.example.cosmetic.Repo.UserRepo;
import com.example.cosmetic.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {
    private  final UserRepo userRepo;

    @Override
    public UserPojo save(UserPojo userPojo) {
        User user= new User();
        return null;
    }
}
