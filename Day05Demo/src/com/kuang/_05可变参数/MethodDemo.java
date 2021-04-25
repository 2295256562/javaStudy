package com.kuang._05可变参数;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *      可变参数
 *  可变参数用在形参中可以接受多个数据
 *  可变参数的格式：数据类型... 参数名称
 *
 *  变参数在方法内部本质就是一个数组。
 *  可变参数需要注意事项：
 *      1. 一个形参列表中可变参数只能有一个！！
 *      2. 可变参数必须放在形参列表的最后面！
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum(1,2,3);
    }

    public static void sum(int... nums){
        // 可变参数在方法内部本质就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
