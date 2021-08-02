package com.kuang._02Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * forech方式遍历Map集合
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1.Map集合添加元素
        maps.put("矿泉水", 500);
        maps.put("可乐", 1000);
        maps.put("雪碧", 800);
        maps.put("果粒橙", 500);

        // 1.把map集合转换成Set集合
        // 次数数据变为 entries = [(矿泉水=100),(可乐=1000),(雪碧=800),(果粒橙=500)]
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2.遍历Set集合
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
