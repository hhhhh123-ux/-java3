package com.example.java3.jvm;

import com.example.java3.jvm.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OOMTest {

    public static List<Object> list = new ArrayList<>();

    // JVM设置
    // -Xms5M -Xmx5M -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./jvm.dump
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (true) {
            //往list 中不停放入student 对象直到OOM
            list.add(new Student(i++, UUID.randomUUID().toString()));
            new Student(j--, UUID.randomUUID().toString());
        }
    }
}

