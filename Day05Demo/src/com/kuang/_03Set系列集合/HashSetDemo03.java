package com.kuang._03Set系列集合;

import java.util.LinkedHashSet;

/**
 *  LinkedHashSet 底层使用哈希表存储元素的，但是每个元素都额外带一个链来维护添加顺序的。
 *  不光增删查快，还有序。缺点是多个一个存储顺序的链会占用内存空间！！而且不允许重复，无索引。
 *
 *  总结：
 *      如果希望元素可以重复，又有索引，查询要快用ArrayList集合。
 *      如果希望元素可以重复，又有索引，增删要快要用LinkedList集合。（适合查询元素比较少的情况）
 *      如果希望增删改查都很快，但是元素不重复以及无序无索引，那么用HashSet集合
 *      如果希望增删改查都很快且有序，但是元素不重复以及无索引，那么用LinkedHashSet集合
 *
 */
public class HashSetDemo03 {
    public static void main(String[] args) {
        LinkedHashSet<String> sets = new LinkedHashSet<>();
    }
}
