package com.example.springbootcache.test01.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author luqianjing
 * date: 2019/10/11
 * description:
 */
@Component
public class Teacher implements Person {
    @Value("#{'Mr Xxx'}")
    public String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void say() {
        System.out.println("I'm a teacher");
    }
}
