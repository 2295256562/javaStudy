package com.kuang._02List系列集合的使用;

import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();


        // LinkedList做队列，队列的特点是先进先出
        list.addLast("张三");
        list.addLast("李四");
        list.addLast("王五");
        System.out.println(list);  // [张三, 李四, 王五]

        list.removeFirst();
        System.out.println(list);   // [李四, 王五]

        // LinkedList做栈，栈的特点是先进后出，例如 手枪弹夹
        LinkedList<String> list1 = new LinkedList<>();
        list1.push("黑");
        list1.push("红");
        list1.push("黄");
        System.out.println(list1);  // [黄, 红, 黑]

        list1.pop();
        System.out.println(list1);  // [红, 黑]
    }
}
