package com.example.springbootcache.test02.service;

import org.springframework.stereotype.Service;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Service
public class AnimalService {
    public void say(){
        System.out.println("I'm an animal");
    }

    public void printParam(String param){
        System.out.println("do business...");
    }

}
