package com.kuang._03Set系列集合;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet: 不重复，无索引，按照大小默认升序排序。
 * TreeSet集合称为不重复集合，可以对元素进行默认的升序排序。
 *
 * TreeSet集合自排序的方式：
 *      1. 有值特性的元素直接可以升序排序。（浮点型，整形）
 *      2. 字符串类型的元素会按照首字符的编号排序。
 *      3. 对于自定义的引用数据类型，TreeSet默认无法排序，执行的时候直接排除，因为不知道排序规则。
 *
 * 自定义的应用数据类型的排序实现：
 *      对于自定义数据的引用数据类型，TreeSet默认无法排序
 *      所有我们需要定制排序的大小规则，可以使用2种方案：
 *      1. 直接为对象的类实现比较规则接口Comparable,重写比较方法
 *      2. 直接为集合设置比较器Comparator对象，重写比较方法。
 *
 *      注意： 如果类和集合都带有比较规则，优先使用集合自带的比较规则。
 */
public class HashSetDemo04 {
    public static void main(String[] args) {
        // TreeSet: 排序不重复集合，有序是表示添加顺序。
        TreeSet<Double> scores = new TreeSet<>();
        scores.add(100.1);
        scores.add(99.1);
        scores.add(80.1);
        scores.add(110.1);
        System.out.println(scores);

        // TreeSet 如果是字符串按照首字符的ASCLL码进行排序。
        TreeSet<String> treeSets = new TreeSet<>();
        treeSets.add("dasda");
        treeSets.add("ADADAD");
        treeSets.add("王梓");
        System.out.println(treeSets);

        // 引用类型的比较
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee("猪老二", 8000, 19 ));
        employees.add(new Employee("孙大哥", 8000, 21 ));
        employees.add(new Employee("沙老弟", 8000, 19 ));
        System.out.println(employees);

        // 集合自带比较器对象  底层是红黑树实现的
        TreeSet<Employee> employees1 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        employees1.add(new Employee("猪老二", 8000, 19 ));
        employees1.add(new Employee("孙大哥", 8000, 21 ));
        employees1.add(new Employee("沙老弟", 8000, 19 ));
        System.out.println(employees1);
    }
}
