package com.example.monolithic_spring_security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.monolithic_spring_security.dao.AuthUserDao;
import com.example.monolithic_spring_security.entity.AuthUser;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    AuthUserDao authUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AuthUser> authUser = authUserDao.findByAuthUsername(username);
        System.out.println("service :" + authUser.get());

        return authUser
                .map((user) -> new CustomerUserDetails(user.getAuthUsername(), user.getAuthPassword(),
                        user.getAllRoles()))
                .orElseThrow(() -> new UsernameNotFoundException(username + " not found"));

    }

}
