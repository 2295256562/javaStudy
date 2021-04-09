package com.kuang._01Collection集合遍历的方式;

import java.util.ArrayList;
import java.util.Iterator;

// 迭代器
public class CollectionDemo01 {
    public static void main(String[] args) {

        /**
         * 迭代器遍历集合
         *     public Iterator<E> iterator() {}：获取集合对应的迭代器，用来遍历集合中的元素。
         *     E next()：获取下一个元素的值。
         *     boolean hasNext()：判断是否有下一个元素，有则返回tree，反之
         */
        ArrayList<String> lists = new ArrayList<>();

        lists.add("DNF");
        lists.add("CF");
        lists.add("LOL");

        Iterator<String> it = lists.iterator();

        while (it.hasNext()){
            System.out.println("今天玩：" + it.next());
        }
    }
}
