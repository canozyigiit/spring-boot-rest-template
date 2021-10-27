package com.can.springbootresttemplate.service;

import com.can.springbootresttemplate.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> getAll();

    User getUserById(int id);

    User getUserByEmail(String email);

    void delete(Integer userId);
}
