package com.example.newsagregate.controller;

import com.example.newsagregate.model.User;

import java.util.concurrent.ConcurrentHashMap;

public class UsersController {
    protected static ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>() {{
        put("admin", new User("admin", "admin", 99));
    }};
}
