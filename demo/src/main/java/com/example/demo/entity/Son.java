package com.example.demo.entity;

/**
 * @author luqianjing
 * date: 2019/09/23
 * description:
 */
public class Son extends Father {
    private static int num = init();

    private static int init() {
        System.out.println("初始化子类静态属性");
        return 10;
    }

    public String name = "son";

    private double subProperty;

    static {
        System.out.println("子类静态块");
    }

    public Son() {
        System.out.println(this.subProperty);
        System.out.println("子类构造");
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    @Override
    public Integer test() {
        return 1;
    }
}
