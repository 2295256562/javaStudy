package com.kuang._05方法引用的概述;

import java.util.ArrayList;

public class MethodDemo01 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        lists.forEach( s-> System.out.println(s));
        // 方法引用
        lists.forEach(System.out::println);
    }
}
