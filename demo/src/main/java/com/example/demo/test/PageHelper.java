package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/11/30
 * description:
 */
public class PageHelper {
    static final ThreadLocal<String> local = new ThreadLocal<>();

    public static void startPage(String name) {
        local.set(name);
    }

    public static String getPage() {
        return local.get();
    }
}
