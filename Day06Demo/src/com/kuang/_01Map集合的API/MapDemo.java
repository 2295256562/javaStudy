package com.kuang._01Map集合的API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        // 1.Map集合添加元素
        maps.put("矿泉水", 500);
        maps.put("可乐", 1000);
        maps.put("雪碧", 800);
        maps.put("果粒橙", 500);

        System.out.println(maps);

        // 2.清空Map集合
        // maps.clear();

        // 3.判断集合是否为空，为空则返回true，否则反之
        System.out.println(maps.isEmpty());

        // 4.根基键获取对应值
        System.out.println(maps.get("可乐"));

        // 5.根据键删除整个元素。（删除会返回键的值）
        System.out.println(maps.remove("果粒橙"));

        // 6. 判断是否包含某个键，包含返回true，反之
        System.out.println(maps.containsKey("雪碧"));  // true

        // 7.判断是否包含某个值
        System.out.println(maps.containsValue(500));  // true

        // 8. 获取全部键的集合：public Set<K> keyset()
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // 9. 获取全部值的集合：Collection<V> values();
        Collection<Integer> values = maps.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // 10.集合的大小
        System.out.println(maps.size());

        // 11.合并其他Map集合
        HashMap<String, Integer> maps2 = new HashMap<>();
        maps2.put("啤酒", 23);
        maps.putAll(maps2);
        System.out.println(maps);
    }
}
