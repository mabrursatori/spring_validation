package com.mabrur.validation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabrur.validation.entites.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
