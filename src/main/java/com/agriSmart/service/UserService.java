package com.agriSmart.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("Ravi - 9876543210 - Andhra Pradesh");
        return users;
    }
}