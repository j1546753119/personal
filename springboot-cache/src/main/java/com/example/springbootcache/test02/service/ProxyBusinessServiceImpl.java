package com.example.springbootcache.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Service
public class ProxyBusinessServiceImpl implements BusinessService {

    @Autowired
    BusinessService businessServiceImpl;

    @Override
    public void say() {
        System.out.println("before say()...");
        businessServiceImpl.say();
        System.out.println("after say()...");
    }
}
