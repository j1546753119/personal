package com.example.springbootcache.test01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luqianjing
 * date 2018/11/12
 * description
 */
@RestController
public class TestController {

//    @RequestMapping(value = "/")
//    @Cacheable(value={"test"},key="#id")
//    public Student print(String id) {
//        return new Student("xiaoming",26);
//    }

    @RequestMapping(value = "/test")
    public String test() {
        return "hello world";
    }
}
