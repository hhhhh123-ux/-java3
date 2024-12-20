package com.example.java3.线程池;


import java.util.concurrent.*;

public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> future = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Running in: " + Thread.currentThread().getName();
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
