package com.mabrur.validation.services;

import java.util.List;

import com.mabrur.validation.entites.User;

public interface UserService {

    List<User> getAll();

    User save(User user);

    
    
}
