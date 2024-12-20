package com.example.java3.设计模式.依赖倒转;

public class DependecyInversion {
    public static void main(String[] args) {

    }
}


class Email {
    public String getInfo() {
        return "电子邮箱" + "Hello Word";
    }

}


//


class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

