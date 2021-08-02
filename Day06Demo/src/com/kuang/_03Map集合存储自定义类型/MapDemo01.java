package com.kuang._03Map集合存储自定义类型;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<Orange, String> maps = new HashMap<>();

        Orange orange1 = new Orange("中国", "黄橘子", 39.99);
        Orange orange2 = new Orange("日本", "青橘子", 139.99);
        Orange orange3 = new Orange("日本", "青橘子", 139.99);


        maps.put(orange1, "江西\n");
        maps.put(orange2, "大阪\n");
        maps.put(orange3, "赣州\n");

        // 重写hashcode() 和 equal() 前打印
        // {{place='日本', name='青橘子', price=139.99}=大阪
        // , {place='日本', name='青橘子', price=139.99}=赣州
        // , {place='中国', name='黄橘子', price=39.99}=江西
        // }

        // 重写hashcode() 和 equal() 后打印
        // {{place='中国', name='黄橘子', price=39.99}=江西
        // , {place='日本', name='青橘子', price=139.99}=赣州
        // }
        System.out.println(maps);
    }
}
