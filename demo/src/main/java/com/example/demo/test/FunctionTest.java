package com.example.demo.test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author luqianjing
 * date 2018/11/11
 * description
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> square = i->i*i;
        Function<Integer,Integer> doubleValue = i->i*2;

        System.out.println(square.apply(3));//9
        System.out.println(doubleValue.andThen(square).apply(4));//64 先执行调用者
        System.out.println(doubleValue.compose(square).apply(4));//32 后执行调用者

        System.out.println(new SquareFun().apply(5));

        BiFunction<Integer,Integer,String>  biFun = (a,b)->"result:"+a+b;
        System.out.println(biFun.apply(2, 3));
    }
}
