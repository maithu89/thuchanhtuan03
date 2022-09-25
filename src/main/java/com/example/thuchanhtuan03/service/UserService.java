package com.example.thuchanhtuan03.service;

import com.example.thuchanhtuan03.authen.UserPrincipal;
import com.example.thuchanhtuan03.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
