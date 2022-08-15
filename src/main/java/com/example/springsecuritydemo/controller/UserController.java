package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Post;
import com.example.springsecuritydemo.model.User;
import com.example.springsecuritydemo.repository.UserRepository;
import com.example.springsecuritydemo.service.PostService;
import com.example.springsecuritydemo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class UserController {
    private UserService userService;
    private PostService postService;

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userService.getById(userId);
    }



    @PostMapping("/users")
    public List<User> saveUsers(@RequestBody List<User> users){
        return userService.saveAll(users);
    }
}
