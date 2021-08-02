package com.kuang._04LinkedHashMap的特点;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1.Map集合添加元素
        maps.put("矿泉水", 500);
        maps.put("可乐", 1000);
        maps.put("雪碧", 800);
        maps.put("矿泉水", 700);
        maps.put("果粒橙", 500);

        System.out.println(maps); // {果粒橙=500, 矿泉水=700, 可乐=1000, 雪碧=800}

        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        // 1.LinkedHashMap集合添加元素
        linkedMap.put("矿泉水", 500);
        linkedMap.put("可乐", 1000);
        linkedMap.put("雪碧", 800);
        linkedMap.put("矿泉水", 700); // 依然是保留前面的位置，只替换其值
        linkedMap.put("果粒橙", 500);
        System.out.println(linkedMap);  // {矿泉水=700, 可乐=1000, 雪碧=800, 果粒橙=500}
    }
}
