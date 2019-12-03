package com.example.demo.test;

import com.example.demo.entity.Student;

import java.lang.reflect.Method;

/**
 * @author luqianjing
 * date: 2019/09/25
 * description:
 */
public class ReflectTest {
    public static void main(String[] args) {
        func(new Student());
    }

    private static void func(Object obj) {
        try {
            Method say = obj.getClass().getDeclaredMethod("say", String.class);
            say.setAccessible(true);
            say.invoke(obj, "yangwenhui");


        } catch (Exception e) {

        }

    }
}
