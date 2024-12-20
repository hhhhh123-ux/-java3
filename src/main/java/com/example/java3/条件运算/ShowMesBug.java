package com.example.java3.条件运算;

public class ShowMesBug {

    public static void main(String[] args) {
        int grade=60;
        System.out.println(sss(grade));
    }

    public static String sss(int grade){
        return grade>=90 ? "A": (grade< 90 && grade>60) ? "B":"C";
    }
}
