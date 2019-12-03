package com.example.demo.test;

import com.example.demo.entity.Student;

import java.util.List;

/**
 * @author luqianjing
 * date: 2019/09/24
 * description:
 */
public class Test {
    public static void main(String[] args) {
//        Father f = new Son();
//        System.out.println(f.name);
//        f.print();
        Student student = new Student();
        student.setMale(true);
        System.out.println(student.male);
        System.out.println(student.isMale);


//        Long a = 128L;
//        Long b = 128L;


    }

    public static <T> T print(T param) {
        return param;
    }

    public static <T extends List> T print2(T param) {
        return param;
    }
}
