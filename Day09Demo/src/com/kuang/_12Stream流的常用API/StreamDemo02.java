package com.kuang._12Stream流的常用API;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");

        // 需求：把名称都加上 "叮当的：xxx"
        list.stream().map(s -> "叮当的：" +s).forEach(System.out::println);

        // 需求：把名称都加工厂学生对象放上去
        list.stream().map(name -> new Student(name)).forEach(System.out::println);
    }
}
