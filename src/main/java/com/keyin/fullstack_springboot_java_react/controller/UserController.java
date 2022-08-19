package com.keyin.fullstack_springboot_java_react.controller;

import com.keyin.fullstack_springboot_java_react.exception.UserNotFoundException;
import com.keyin.fullstack_springboot_java_react.model.User;
import com.keyin.fullstack_springboot_java_react.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("http://localhost:3000")  // connects back end to front end on port 3000

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
