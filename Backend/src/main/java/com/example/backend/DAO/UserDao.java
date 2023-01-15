package com.example.backend.DAO;

import com.example.backend.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
