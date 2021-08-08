package com.kuang._14收集Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");
        list.add("张三丰");

        // forEach 终结方法
        Stream<String> zhangLists = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        // 把Stream流转换成Set集合
        // Set<String> sets = zhangLists.collect(Collectors.toSet());
        // System.out.println(sets);

        // 把Stream流转换成List集合
        List<String> lists = zhangLists.collect(Collectors.toList());
        System.out.println(lists);

        // 把Stream流转换成数组
        Stream<String> zhangLists2 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3);
        String[] arrs = zhangLists2.toArray(String[]::new);
        System.out.println(Arrays.toString(arrs));

    }
}
