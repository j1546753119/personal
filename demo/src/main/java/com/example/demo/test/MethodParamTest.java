package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/09/24
 * description:
 */
public class MethodParamTest {
    public static void main(String[] args) {
        int num = 0;
        String str = "str";
        StringBuilder sb = new StringBuilder("stringBuilder");

        func(num);
        func(str);
        func(sb);
        func2(sb);

        System.out.println(num);
        System.out.println(str);
        System.out.println(sb);
        System.out.println(sb);

    }

    private static void func2(StringBuilder stringBuilder) {
        stringBuilder = null;
    }

    private static void func(StringBuilder stringBuilder) {
        stringBuilder.append(" change");
    }

    private static void func(String str) {
        str = str + " change";
    }

    private static void func(int num) {
        num++;
    }
}
