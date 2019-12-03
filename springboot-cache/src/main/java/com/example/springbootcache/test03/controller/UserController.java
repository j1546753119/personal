package com.example.springbootcache.test03.controller;

import com.example.springbootcache.test03.Service.UserRelService;
import com.example.springbootcache.test03.Service.UserService;
import com.example.springbootcache.test03.model.User;
import com.example.springbootcache.test03.model.UserRel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author luqianjing
 * date: 2019/10/20
 * description:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    static ThreadLocal<String> local = new ThreadLocal<>();
    @Autowired
    UserService userService;

    @Autowired
    UserRelService userRelService;

    private static ThreadPoolExecutor genReplenishDetailExecutor = new ThreadPoolExecutor(20, 20, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(200), Executors.defaultThreadFactory());

    @RequestMapping("query_user")
    public List<User> query() {
        return userService.query();
    }

    @RequestMapping("query_user_rel")
    @Transactional(isolation = Isolation.READ_UNCOMMITTED, rollbackFor = Exception.class)
    public List<UserRel> queryRel() {
        return userRelService.query();
    }

    @RequestMapping("add_user")
    @Transactional(rollbackFor = Exception.class)
    public Long addUser(String name) {
        User user = new User();
        user.setName(name);
        return userService.addUser(user);
    }

    @RequestMapping("test_propagation")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void test() throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        User user = new User();
        user.setName("spring");
        userService.addUser(user);
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            futures.add(genReplenishDetailExecutor.submit(() -> {
                long start = System.currentTimeMillis();
                userRelService.addRel(1000L);
                System.out.println("expend: " + (System.currentTimeMillis() - start));
                int a = 1 / 0;
            }));
        }
        // userService.addUser(user);
        for (Future future : futures) {
            try {
                System.out.println("取出结果");
                future.get();

            } catch (Exception e) {
                System.out.println("异常");
            }
        }
        System.out.println("总耗时:" + (System.currentTimeMillis() - startTime));

    }

    @RequestMapping("test_p")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void test2() {
        User user = new User();
        user.setName("spring");
        userService.addUser(user);
        try {
            userRelService.addRel(user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("aaaaa");
        userService.addUser(user);
    }

}
