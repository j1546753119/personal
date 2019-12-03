package com.example.springbootcache.test01.domain;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * @author luqianjing
 * date 2018/11/13
 * description
 */
//@Component
//@Conditional(StudentConditional.class)
public class Student implements Person, Serializable {

    private static final long serialVersionUID = 8057790503271487895L;

    @Value("${test.name}")
    private String originName;

    @Value("#{'${test.name}'.substring(4)}")
    private String name;

    @Value("#{T(System).currentTimeMillis()}")
    private long startTime;

    @Value("#{teacher.name?.toUpperCase()}")
    private String teacherName;

    @Value("18")
    private int age;

    @Value("#{3.14}")
    private float floatValue;

    public Student() {

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
        return "Student{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void say() {
        System.out.println(this.toString());
    }
}
