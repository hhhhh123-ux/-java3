package com.example.java3.集合.Map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        System.out.println("ConcurrentHashMapDemo");
        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put("san", "张三");
    }
}
