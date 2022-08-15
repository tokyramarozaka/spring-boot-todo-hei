package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.User;
import com.example.springsecuritydemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User getById(Long userId){
        return repository.getReferenceById(userId);
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    @Transactional
    public List<User> saveAll(List<User> users){
        return repository.saveAll(users);
    }
}
