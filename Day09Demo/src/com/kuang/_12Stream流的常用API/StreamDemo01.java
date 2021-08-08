package com.kuang._12Stream流的常用API;

import java.util.ArrayList;

/**
 *  目标：
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        // 需求：从集合中筛选出所有姓张的人出来，然后再找出姓名长度是3的人
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");

        list.stream().filter(s -> s.length() == 3);

        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);

        // 取前两个
        list.stream().filter(s -> s.length() == 3).limit(2).forEach(System.out::println);
        System.out.println("==================================");

        // 跳过前两个
        list.stream().filter(s -> s.length() == 3).skip(2).forEach(System.out::println);
    }
}
