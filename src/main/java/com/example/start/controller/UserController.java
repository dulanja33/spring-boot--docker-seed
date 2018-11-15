package com.example.start.controller;

import com.example.start.model.User;
import com.example.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    List<User> all() {
        return userService.getAll();
    }

    @PostMapping("/employees")
    User newUser(@RequestBody User user) {
        return null;
    }


    @GetMapping("/user/{id}")
    User one(@PathVariable Long id) {

        return null;
    }

    @PutMapping("/user/{id}")
    User replaceUser(@RequestBody User user, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/employees/{id}")
    void deleteUser(@PathVariable Long id) {
    }

    @PatchMapping("/user/{id}")
    User patchUser(@RequestBody User user, @PathVariable Long id) {
        return null;
    }

}
