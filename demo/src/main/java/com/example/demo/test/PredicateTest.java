package com.example.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author luqianjing
 * date 2018/11/11
 * description
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        eval(list,a->a%2==0);
    }
    private static void eval(List<Integer> list, Predicate<Integer> condition){
        list.stream().filter(condition) .forEach(System.out::println);
        list.stream().map(i->i*i).forEach(System.out::println);
    }

}
