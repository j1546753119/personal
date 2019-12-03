package com.example.springbootcache.test03.Service;

import com.example.springbootcache.test03.model.User;

import java.util.List;

/**
 * @author luqianjing
 * date: 2019/10/20
 * description:
 */
public interface UserService {
    List<User> query();

    Long addUser(User user);
}
