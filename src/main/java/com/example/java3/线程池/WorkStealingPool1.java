package com.example.java3.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkStealingPool1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newWorkStealingPool();
        for (int i = 0; i < 5; i++) {
            service.submit(() -> {
                System.out.println("线程名：" + Thread.currentThread().getName());
            });
            while (!service.isTerminated()) {
            }
        }
    }
}
