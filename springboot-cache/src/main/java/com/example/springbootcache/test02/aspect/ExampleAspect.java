package com.example.springbootcache.test02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Aspect
//@Component
@Order(1)
public class ExampleAspect {

    @Pointcut("execution(* com.example.springbootcache.test02.service.AnimalService.printParam(..))")
    public void pointCut(){}

    @Before("pointCut() && args(param)")
    public void before(JoinPoint jp,String param){
        System.out.println("before...");
        System.out.println(Arrays.toString(jp.getArgs()));
        System.out.println(">>>>>>>>>>>> request param is: "+param);
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("around before...");
        pj.proceed();
        System.out.println("around after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
}
