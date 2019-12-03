package com.example.springbootcache;

import com.example.springbootcache.test01.service.TestService;
import com.example.springbootcache.test02.bean.MyInterceptor;
import com.example.springbootcache.test02.bean.MyInvocationHandler;
import com.example.springbootcache.test02.service.AnimalService;
import com.example.springbootcache.test02.service.BusinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {
    @Autowired
    TestService testService;

    @Autowired
    BusinessService proxyBusinessServiceImpl;

    @Autowired
    BusinessService businessServiceImpl;

    @Autowired
    MyInterceptor myInterceptor;

    @Autowired
    AnimalService animalService;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void print(){
        //ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getBean("tea"));
        //testService.say();
    }

    @Test
    public void testProxy() {
        proxyBusinessServiceImpl.say();
    }

    @Test
    public void dynamicProxy() {
        BusinessService businessService = (BusinessService) MyInvocationHandler.getProxyBean(businessServiceImpl);
        businessService.say();
    }

    @Test
    public void cglibProxy() {
        AnimalService proxyBean = (AnimalService) myInterceptor.getProxyBean(animalService);
        proxyBean.say();
    }

    @Test
    public void testAspect(){
        animalService.printParam("111");
    }

    @Test
    public void getBean(){
        AnimalService bean = applicationContext.getBean(AnimalService.class);
        bean.printParam("111");
    }

}
