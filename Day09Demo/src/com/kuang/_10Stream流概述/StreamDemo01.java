package com.kuang._10Stream流概述;

import java.util.ArrayList;

/**
 * 目标： 显示Stream流的强大
 * <p>
 * 什么是Stream流 在Java 8中，得益于Lambda所带来的
 *<p>
 *  Stream流解决什么问题？
 *      可以解决已有集合类库或者数据API的弊端
 *      Stream认为集合和数组操作的API很不好用，所以采用了Stream流简化集合和数组的操作
 * <p>
 * 小结：
 *      Stream流是用来简化集合类库或者数组API的弊端
 *      Stream流其实就是一根传送带，元素在上面可以被Stream流操作
 */
public class StreamDemo01 {
    public static void main(String[] args) {
        // 需求：从集合中筛选出所有姓张的人出来，然后再找出姓名长度是3的人
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("赵强");
        list.add("张三丰");

        list.stream().filter(s -> s
                .startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);
    }
}
