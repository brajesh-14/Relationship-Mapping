package com.jpa.poc.JpaPoc.controller;

import com.jpa.poc.JpaPoc.dto.UserDto;
import com.jpa.poc.JpaPoc.entity.User;
import com.jpa.poc.JpaPoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userID){
        User user = userService.getUser(userID);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/custom")
    public ResponseEntity<List<User>> getCustomUser(@RequestParam String city, @RequestParam String gender){
        List<User> allUsers = userService.getCustomUser(city, gender);
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody UserDto userdto){
        User saveUser = userService.saveUser(userdto);
        return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
        
    }
}
