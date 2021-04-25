package com.kuang._03Set系列集合;

import java.util.HashSet;

/**
 *
 * Set系列集合添加元素无序的根本原因是因为底层采用了哈希表存储元素。
 *      JDK 1.8之前：哈希表 = 数组 + 链表 + （哈希算法）
 *      JDK 1.8之后：哈希表 = 数组 + 链表 + 红黑树 + （哈希算法）
 *          当链表长度超过阀值（8）时，将链表转换为红黑树，这样大大减少查找的时间。
 *
 * 哈希算法：
 *      1. 先获取元素对象的哈希值
 *      2. 让当前对象的哈希值对底层数组长度求余
 *      3. 求余的结果作为该对象元素在底层数组的索引位置
 *      4. 把该对象元素存入到该索引位置
 *
 *  总结：
 *      Set系列集合是基于哈希表存储数据的，增删改查的性能都很好
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("mybatis");
    }
}
