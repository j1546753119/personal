package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/09/25
 * description:
 */
public class OverLoadMethodsTest {
    public static void main(String[] args) {
        //method(3);
        //method(13, 14);
        //method(null);
    }

    public static void method() {
        System.out.println("无参方法");
    }

    public static void method(int param) {
        System.out.println("基本类型参数方法");
    }

    public static void method(Integer param) {
        System.out.println("包装类型参数方法");
    }

    public static void method(long param) {
        System.out.println("更大范围基本类型参数方法");
    }


    public static void method(int... param) {
        System.out.println("可变参数方法");
        System.out.println(param);
    }

    public static void method(Object param) {
        System.out.println("参数为Object方法");
    }

    public static void method(Integer param1, int param2) {

    }

    public static void method(int param1, Integer param2) {

    }


}
