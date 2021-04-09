package com.kuang._05抽象类设计模板模式;

/**
 * 目标：抽象类设计模板设计模式。
 *
 * 模板设计模式的作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写！可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重写实现！
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.wirte();
    }
}

// 设计一个抽象模板
abstract class Template {
    private String title = "\t\t\t\t\t\t《我的java之路》";
    private String one = "\t\t学习java真的香";
    private String last = "\t\t写代码使我快乐";

    public void wirte() {
        System.out.println(title);
        System.out.println(one);
        System.out.println(wirteMain());
        System.out.println(last);
    }

    // 定义抽象方法，提供子类调用
    public abstract String wirteMain();
}

class Student extends Template {

    @Override
    public String wirteMain() {
        return "\t\t我正在学习java抽象类，abstract关键字";
    }
}