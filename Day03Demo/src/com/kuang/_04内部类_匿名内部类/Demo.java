package com.kuang._04内部类_匿名内部类;

/**
 * 匿名内部类语法：
 *      new 类名|抽象类|接口(形参){
 *            方法重写
 *      }
 *
 *  匿名内部类的特点
 *      1.匿名内部类是一个没有名字的内部类。
 *      2.匿名内部类一旦写出来，就会立即创建一个匿名内部类的对象返回
 *      3.匿名内部类的对象的类型相当于是当前new的那个类型的子类类型。
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("我们一起去看海");
            }
        };
        a.run();
        a.go();
    }
}


abstract class Animal{
    public abstract void run();

    public void go(){
        System.out.println("提桶跑路~~");
    }
}