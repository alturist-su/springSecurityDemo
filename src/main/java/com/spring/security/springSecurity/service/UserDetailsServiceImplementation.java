package com.spring.security.springSecurity.service;

import com.spring.security.springSecurity.model.UserPrincipal;
import com.spring.security.springSecurity.model.Users;
import com.spring.security.springSecurity.repo.UserRepo;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        System.out.println(username);
        System.out.println(user);
        System.out.println(user.getUsername());
        
        return new UserPrincipal(user);
    }
}
