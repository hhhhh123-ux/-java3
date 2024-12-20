package com.example.java3.集合.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 创建一个 LinkedHashMap，插入顺序会被维护
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // 插入元素
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // 打印当前 map
        System.out.println("插入顺序:");
        printMap(map);

        // 访问元素 (会改变访问顺序)
        map.get("B");

        // 打印访问顺序
        System.out.println("\n访问顺序 (B 被访问后，B 移动到最后):");
        printMap(map);

        // 删除元素
        map.remove("A");

        // 打印删除后的 map
        System.out.println("\n删除元素 A 后的顺序:");
        printMap(map);
    }

    // 打印 map 中的键值对
    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
