package com.kuang._02集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {

        // 因为HashSet继承了Conllection，所有这里我们用collection来接收
        // 多态
        Collection<String> sets = new HashSet<>();

        // add 集合添加元素
        sets.add("苹果");
        sets.add("橘子");
        sets.add("🍌");
        System.out.println(sets);

        // clear 移除
//        sets.clear();
//        System.out.println(sets);

        // isEmpty 判断集合是否为空，则返回true，反之
        System.out.println(sets.isEmpty());

        // size 获取集合的大小
        System.out.println(sets.size());

        // contains 判断集合是否包含某个元素
        System.out.println(sets.contains("苹果"));

        // remove 删除某个元素，如果元素重复则默认删除第一个
        sets.remove("苹果");
        System.out.println(sets);

        // toArray 把集合转换为数组
        Object[] array = sets.toArray();
        System.out.println(Arrays.toString(array));

//        String[] array1 = sets.toArray(String[]::new);
//        System.out.println(array1);

        Collection<String> arr = new ArrayList<>();
        arr.add("猫");
        arr.add("狗");

        Collection<String> arr1 = new ArrayList<>();
        arr1.add("猪");

        arr.addAll(arr1);
        System.out.println(arr);
        System.out.println(arr1);


    }
}
