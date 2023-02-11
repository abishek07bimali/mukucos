package com.example.cosmetic.Services;

import com.example.cosmetic.Entity.User;
import com.example.cosmetic.Pojo.UserPojo;

public interface UserServices {
    UserPojo save (UserPojo userPojo);
    User findByEmail(String email);

    User findBYId(Integer id);


}
