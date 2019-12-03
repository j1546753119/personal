package com.example.demo.service;

import com.example.demo.entity.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author luqianjing
 * date: 2019/11/06
 * description:
 */
@Service
public class TestService {
    @Autowired
    public Bean bean;

    @Autowired
    @Lazy
    Bean bean2;

    @Autowired
    @Lazy
    Bean bean3;

    public void print() {
        System.out.println(bean3 == bean2);
    }
}
