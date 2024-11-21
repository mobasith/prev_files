package com.example.monolithic_spring_security.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.monolithic_spring_security.entity.AuthUser;

public interface AuthUserDao extends JpaRepository<AuthUser, Integer> {
    Optional<AuthUser> findByAuthUsername(String authUsername);

}
