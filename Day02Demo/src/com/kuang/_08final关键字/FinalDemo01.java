package com.kuang._08final关键字;

/**
 *  final是“最终”的含义
 *  final可以用于修饰类，方法，变量。
 *     1. final修饰类：类不能被继承了。
 *     2. final修饰方法：方法不能被重写。
 *     3. final修饰变量，变量有且仅能被赋值一次。
 *
 *   拓展：abstract 和 final的关系是什么？ 互斥关系！ 不能同时出现修饰成员
 *         final修饰静态成员变量可以在那些地方赋值一次
 *         1. 定义的时候赋值一次。
 *         2. 可以在静态代码块中赋值一次。
 *         3. 在每个构造器中赋值一次。
 */
public class FinalDemo01 {
}
