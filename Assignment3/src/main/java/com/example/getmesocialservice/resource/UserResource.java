package com.example.getmesocialservice.resource;


import com.example.getmesocialservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.getmesocialservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {


    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();

    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/user")
    public User deleteUser(@RequestParam(name = "id") int id){
        return userService.deleteUser(id);
    }
}
