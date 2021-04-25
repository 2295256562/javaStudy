package com.kuang._04Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // 1. 给集合批量添加元素
        ArrayList<String> list = new ArrayList<>();
        /**
         * 参数1：被添加元素的集合
         * 参数2：可变参数，一批元素
         */
        Collections.addAll(list, "猪八戒", "唐僧", "孙悟空");
        System.out.println(list);  // [猪八戒, 唐僧, 孙悟空]

        // 2.打乱集合的顺序
        // 注意： 只能打乱有序的List集合
        Collections.shuffle(list);
        System.out.println(list);

        // 3.对进行进行升序排序
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Collections.addAll(doubleArrayList, 12.2, 11.3, 9.9);
        Collections.sort(doubleArrayList);
        System.out.println(doubleArrayList);
    }
}
