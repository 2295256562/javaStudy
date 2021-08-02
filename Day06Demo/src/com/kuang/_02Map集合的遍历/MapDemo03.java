package com.kuang._02Map集合的遍历;

import java.util.HashMap;
import java.util.Map;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1.Map集合添加元素
        maps.put("矿泉水", 500);
        maps.put("可乐", 1000);
        maps.put("雪碧", 800);
        maps.put("果粒橙", 500);

        maps.forEach((key, value) ->{
            System.out.println(key + "=>" + value);
        });
    }
}
