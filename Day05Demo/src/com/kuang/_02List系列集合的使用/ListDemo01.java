package com.kuang._02List系列集合的使用;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {

    /**
     * void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
     * E get(int index)：返回集合中指定位置上的元素
     * E remove(int index)：移除列表中指定位置的元素，返回被移除元素的列表
     * E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回更新前的元素
     *
     * @param args
     */
    public static void main(String[] args) {
        // List: 有序，可重复，有索引
        List<String> arrayLists = new ArrayList<>();

        arrayLists.add("java");
        arrayLists.add("python");
        arrayLists.add("go");

        System.out.println(arrayLists);

        arrayLists.add(2, "ruly");
        System.out.println(arrayLists);

        String out = arrayLists.get(3);
        System.out.println(out);

        arrayLists.remove(3);
        System.out.println(arrayLists);

        System.out.println(arrayLists.set(1, "govry"));
        System.out.println(arrayLists);
    }
}
