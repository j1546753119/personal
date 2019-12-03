package com.example.demo.entity;

import java.util.Objects;

/**
 * @author luqianjing
 * date: 2019/09/23
 * description:
 */
public class Father {
    static {
        System.out.println("父类静态块");
    }

    private static int val = initVal();

    private static int initVal() {
        System.out.println("初始化父类静态属性");
        return 10;
    }

    public String name = "father";

    private int property;


    public Father() {
        System.out.println(this.property);
        System.out.println("父类构造");
    }

    public void print() {
        System.out.println(this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return Objects.equals(name, father.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Object test() {
        return null;
    }
}
