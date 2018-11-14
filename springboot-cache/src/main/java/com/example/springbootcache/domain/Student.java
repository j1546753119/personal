package com.example.springbootcache.domain;

import java.io.Serializable;

/**
 * @author luqianjing
 * date 2018/11/13
 * description
 */
public class Student implements Serializable{
    private static final long serialVersionUID = -2760472347672214460L;
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
