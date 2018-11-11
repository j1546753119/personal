package com.example.demo.test;

import java.util.function.Function;

/**
 * @author luqianjing
 * date 2018/11/11
 * description
 */
public class SquareFun implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
