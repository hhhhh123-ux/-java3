package com.example.java3.线程池;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutor1 {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        System.out.println("添加任务时间：" + LocalDateTime.now());
        ses.scheduleAtFixedRate(() -> System.out.println(Thread.currentThread().getName() + "执行时间：" + LocalDateTime.now()), 2, 4, TimeUnit.SECONDS);
    }

}
