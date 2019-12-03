package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luqianjing
 * date: 2019/09/25
 * description:
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(test());
        List<Object> list = new ArrayList();
        list.add(1);
        list.add("abc");


    }

    private static int test() {
        int num = 1000;
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            return ++num;
        } finally {
            num += 1000;
            //return num;
        }
        return 0;
    }
}
