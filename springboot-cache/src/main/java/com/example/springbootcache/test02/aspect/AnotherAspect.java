package com.example.springbootcache.test02.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @author luqianjing
 * date: 2019/10/21
 * description:
 */
@Aspect
//@Component
@Order(2)
public class AnotherAspect {

    @Pointcut("execution(* com.example.springbootcache.test02.service.AnimalService.printParam(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("before2...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after2...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("around before2...");
        pj.proceed();
        System.out.println("around after2...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning2...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing2...");
    }

}
