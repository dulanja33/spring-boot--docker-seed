package com.example.start.service;

import com.example.start.exceptions.ResourceNotFoundException;
import com.example.start.model.User;
import com.example.start.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        List<User> all = userRepository.findAll();
        if(all == null || all.isEmpty()){
            throw new ResourceNotFoundException("test","test2","test");
        }
        return all;
    }
}
