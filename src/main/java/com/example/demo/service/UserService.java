package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRespositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRespositroy userRespositroy;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        for(User user: userRespositroy.findAll()){
            users.add(user);
        }

        return users;
    }
}
