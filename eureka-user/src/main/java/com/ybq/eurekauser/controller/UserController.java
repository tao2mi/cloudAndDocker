package com.ybq.eurekauser.controller;


import com.netflix.discovery.DiscoveryClient;
import com.ybq.eurekauser.dao.UserRepository;
import com.ybq.eurekauser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

}
