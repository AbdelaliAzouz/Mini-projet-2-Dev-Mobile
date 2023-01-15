package com.example.backend.Service;

import com.example.backend.Entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public User getUser(User user);

    public User insertIntoDatabase(User user);
}
