package com.github.marciokleber.springintroduction.controller;

import com.github.marciokleber.springintroduction.domain.entity.User;
import com.github.marciokleber.springintroduction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
