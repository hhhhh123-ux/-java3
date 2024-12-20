package com.example.java3.设计模式.单例模式.懒汉式;


public class Main {
    public static void main(String[] args) {
        // Singleton s0 = new Singleton(); // 原先的实例化方法
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("两个对象是相同的实例");
        }
    }
}
