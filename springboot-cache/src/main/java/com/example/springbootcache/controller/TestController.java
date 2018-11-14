package com.example.springbootcache.controller;

import com.example.springbootcache.domain.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luqianjing
 * date 2018/11/12
 * description
 */
@RestController
public class TestController {
    @RequestMapping(value = "/")
    @Cacheable(value={"test"},key="#id")
    public Student print(String id) {
        return new Student("tingting",26);
    }
}
