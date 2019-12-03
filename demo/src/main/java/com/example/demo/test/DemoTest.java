package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/11/07
 * description:
 */
public class DemoTest {

    private static int count = 0;

    private void add10K(boolean flag) {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final DemoTest test = new DemoTest();

        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(() -> {
            test.add10K(true);
        });
        Thread th2 = new Thread(() -> {
            test.add10K(false);
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(calc());
    }
}
