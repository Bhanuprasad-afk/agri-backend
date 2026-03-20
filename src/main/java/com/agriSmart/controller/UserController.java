package com.agriSmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.agriSmart.service.UserService;
import java.util.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<String> getUsers() {
        return service.getUsers();
    }
}