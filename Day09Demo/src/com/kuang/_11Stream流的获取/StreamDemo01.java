package com.kuang._11Stream流的获取;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Stream流式思想的核心：
 *      是先得到集合或者数组的Stream流（就是一根传送带）
 *      然后就用这个Stream流操作集合或者数组的元素
 *      然后用Stream流简化替代集合操作的API
 *
 * 集合获取流的API:
 *      default Stream<E> stream();
 *
 * 小结：
 *     集合获取Stream流用：stream();
 *     数组：Arrays.stream(数组)  / Stream.of(数组);
 */
public class StreamDemo01 {
    public static void main(String[] args) {

        /*---------------------Collection集合获取流-------------*/
        ArrayList<String> strings = new ArrayList<>();
        Stream<String> stream = strings.stream();

        /*--------------------Map集合获取流---------------------*/
        HashMap<String, Integer> map = new HashMap<>();
        // 获取键的Stream流
        Stream<String> keys = map.keySet().stream();
        // 获取值的Stream流
        Stream<Integer> values = map.values().stream();
        // 获取键值对的Stream流
        Stream<Map.Entry<String, Integer>> keyAndValues = map.entrySet().stream();


        /*--------------------数组获取流-----------------------*/
        String[] arrs = new String[]{"JAVA", "PYTHON", "Spring boot"};
        Stream<String> arrss1 = Arrays.stream(arrs);
        Stream<String> arrss2 = Stream.of(arrs);
    }
}
