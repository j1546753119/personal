package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author luqianjing
 * date: 2019/09/23
 * description:
 */
@Data
public class Student {

    private String name;
    private int age;
    private int gender;
    public boolean isMale;
    public boolean male;
    private Date birthDay;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void say(String name) {
        System.out.println(name + " is a student.");
    }

}
