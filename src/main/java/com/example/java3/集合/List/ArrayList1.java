package com.example.java3.集合.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> list = new ArrayList<>();
        list.add("Hello Word");
        list.add("Hello World");
        System.out.println(list);
        list.add(1, "Hello");
        System.out.println(list);
        list.remove("Hello Word");
        list.remove(2);
        list.get(1);
        System.out.println(list);

        List<String> list1 = new LinkedList<>();
        list1.add("Hello Word");
        list1.add("Hello World");
        System.out.println(list1);
        list1.add(1, "Hello");
        System.out.println(list1);
        list1.remove("Hello Word");
        list1.remove(2);
        list1.get(1);
        System.out.println(list1);

    }
}
