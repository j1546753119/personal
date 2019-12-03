package com.example.springbootcache.test02.service;

import org.springframework.stereotype.Service;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Override
    public void say() {
        System.out.println("say()原方法逻辑");
    }
}
