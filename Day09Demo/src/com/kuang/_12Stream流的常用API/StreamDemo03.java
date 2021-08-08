package com.kuang._12Stream流的常用API;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");

        Stream<Integer> s1 = Stream.of(10, 20, 30, 40);
        Stream<String> s2 = list.stream();

        Stream<Object> allStream = Stream.concat(s1, s2);
        allStream.forEach(System.out::println);
    }
}
