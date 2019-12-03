package com.example.springbootcache.test02.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;

    public static Object getProxyBean(Object target){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),myInvocationHandler);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理，before...");
        method.invoke(target, args);
        System.out.println("JDK动态代理，after...");
        return null;
    }
}
