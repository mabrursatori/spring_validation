package com.mabrur.validation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mabrur.validation.entites.User;
import com.mabrur.validation.repositories.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

}
