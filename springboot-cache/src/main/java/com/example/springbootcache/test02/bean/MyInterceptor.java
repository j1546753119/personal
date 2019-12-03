package com.example.springbootcache.test02.bean;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Component
public class MyInterceptor implements MethodInterceptor {

    public Object getProxyBean(Object target){
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(target.getClass());
        // 设置enhancer的回调对象
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理，before...");
        methodProxy.invokeSuper(o,objects);
        System.out.println("cglib动态代理，after...");
        return o;
    }
}
