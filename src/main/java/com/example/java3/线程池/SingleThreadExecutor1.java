package com.example.java3.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor1 {

    public static void main(String[] args) {
        ExecutorService es=Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            es.submit(() -> System.out.println("线程名：" + Thread.currentThread().getName()));
        }
    }
}
