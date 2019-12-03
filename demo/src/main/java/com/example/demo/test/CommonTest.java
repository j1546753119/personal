package com.example.demo.test;

/**
 * @author luqianjing
 * date: 2019/11/07
 * description:
 */
public class CommonTest {
    int a = 0;

    synchronized void print() {
        System.out.println(Thread.currentThread().getName() + " execute...");
        a++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (a % 2 != 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " start wait()...");
                wait();
                System.out.println(Thread.currentThread().getName() + " end wait()...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end");
        notifyAll();
    }

    public static void main(String[] args) {
        CommonTest test = new CommonTest();
        Thread th1 = new Thread(() -> {
            test.print();
        });
        Thread th2 = new Thread(() -> {
            test.print();
        });
        Thread th3 = new Thread(() -> {
            test.print();
        });
        th1.start();
        th2.start();
        th3.start();
    }

}
