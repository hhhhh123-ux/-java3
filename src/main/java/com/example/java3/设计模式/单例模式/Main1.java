package com.example.java3.设计模式.单例模式;

import com.example.java3.设计模式.单例模式.饿汉式.Singleton;

/**
 * @Author:wjy
 */
public class Main1 {
    public static void main(String[] args) {
        // 创建两个线程，尝试创建两个 Singleton 实例
        Thread t1 = new Thread(() -> {
            Singleton s = Singleton.getInstance();
            System.out.println("Thread 1 created instance: " + s);
        });

        Thread t2 = new Thread(() -> {
            Singleton s = Singleton.getInstance();
            System.out.println("Thread 2 created instance: " + s);
        });

        Thread t3 = new Thread(() -> {
            Singleton s = Singleton.getInstance();
            System.out.println("Thread 3 created instance: " + s);
        });

        // 启动线程
        t1.start();
        t2.start();
        t3.start();


        // 等待线程结束
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

