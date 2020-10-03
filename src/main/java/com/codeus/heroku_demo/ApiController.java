package com.codeus.heroku_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping("data")
    public List<User> data()
    {
        //Hello world
        List<User> users = new ArrayList<>();
        users.add(new User("Peter", "peter@email.com"));
        users.add(new User("Paul", "paul@email.com"));
        users.add(new User("Parker", "parker@email.com"));
        users.add(new User("Payne", "payne@email.com"));
        return users;
    }
}

class User
{
    private String name, email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}