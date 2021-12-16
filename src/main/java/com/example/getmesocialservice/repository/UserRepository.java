package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User( "Tom","example@hotmail.com", 0, "ExampleURL");
        return user;
    }

}
