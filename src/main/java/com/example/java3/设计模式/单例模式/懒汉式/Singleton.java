package com.example.java3.设计模式.单例模式.懒汉式;

/**
 * @Author:wjy
 */

public class Singleton{

    //在该类中创建一个该类的对象供外界去使用
    private static Singleton instance= new Singleton();

    // 构造方法 private 化
    private Singleton(){

    }

    // 得到 Singleton 的实例(唯一途径）
    public static Singleton getInstance() {
        return instance;
    }
}



