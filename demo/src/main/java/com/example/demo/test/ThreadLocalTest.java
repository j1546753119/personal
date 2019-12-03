package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/11/30
 * description:
 */
public class ThreadLocalTest {

    public static void main(String[] args) {

        new Thread(() -> {
            PageHelper.startPage("a");
            System.out.println(PageHelper.getPage());
        }).run();

        new Thread(() -> {
            System.out.println(PageHelper.getPage());
        }).run();

    }
}
