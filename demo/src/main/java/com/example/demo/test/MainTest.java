package com.example.demo.test;

import com.example.demo.entity.Student;

import java.util.function.Supplier;

/**
 * @author luqianjing
 * date 2018/11/10
 * description
 */
public class MainTest {
    public static void main(String[] args) {
        int num = 5;
        Convert con = a->a+num;
        System.out.println(con.print("a"));
        //num++ 编译报错

        Supplier<Student> supply =  Student::new;
        System.out.println(supply.get());
    }
    @FunctionalInterface //可有可无，但如果要使用lambda表达式，只能有一个抽象方法
    interface Convert{
        String print(String a);
    }
}
