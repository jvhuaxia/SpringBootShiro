package com.example.demo62.service;


import com.example.demo62.pojo.User;

public interface UserService {
    public void saveUser(User user);

    public User getUser(String userName);
}
