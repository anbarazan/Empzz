//package com.example.Studentdemo;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service 
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private headRepo repo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Head h1 = repo.findByUsername(username);
//        if (h1 == null) {
//            System.out.println("User Not Found....");
//            throw new UsernameNotFoundException(username + " Not Found");
//        }
//
//        return new User(h1.getUsername(), h1.getPassword(), new ArrayList<>());
//    }
//}
//
