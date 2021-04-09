package com.kuang._01Collection集合遍历的方式;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {

        /**
         *  lambda的方式遍历
         *  语法： for(遍历对象的数据类型 变量 : 需要遍历的集合对象){}
         */
        Collection<String> lists = new ArrayList<>();
        lists.add("DNF");
        lists.add("CF");
        lists.add("LOL");


        lists.forEach(System.out::println);
    }
}
