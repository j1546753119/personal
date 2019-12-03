package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/09/24
 * description:
 */
public class ElasticParamTest {
    public static void main(String[] args) {
        print("aa", new String[]{"p1", "p2"});
        print("aa", "p1", "p2");

        printLength("a", "b", "c");
        printLength(new int[]{1, 2, 3});
        printLength(new String[]{"a", "b", "c"});
        printLength("a", new String[]{"a", "b", "c"});
    }

    public static void printLength(Object... args) {
        System.out.println(args.length);
    }

    /**
     * 一个方法只能有一个可变参数，且必须是该方法的最后一个参数
     */
    public static void print(String name, String... args) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" params:");
        for (String arg : args) {
            sb.append(arg);
            sb.append(",");
        }
        System.out.println(sb.toString());
    }

}
