package com.example.springbootcache.test03.Service;

import com.example.springbootcache.test03.model.UserRel;

import java.util.List;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
public interface UserRelService {
    List<UserRel> query();

    void addRel(Long userId);
}
