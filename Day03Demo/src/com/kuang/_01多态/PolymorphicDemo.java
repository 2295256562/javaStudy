package com.kuang._01多态;

/**
 *  多态概念
 *      同一个类型的对象，执行用一个行为，在不同状态下会表现出不同的行为特征
 *
 *   多态的识别技巧：
 *      对于方法的调用：编译看左边，运行看右边。
 *      对于变量的调用：编译看左边，运行看左边。
 *
 *   多态的使用前提：
 *      1. 必须存在继承或者实现关系。
 *      2. 必须存在父类类型的变量引用子类类型的对象。
 *      3. 需要存在方法重写。
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal animal = new Rabbit();
        animal.run();
    }
}

class Animal {
    public void run(){
        System.out.println("动物四条腿跑~~~");
    }
}

class Rabbit extends Animal{
    @Override
    public void  run() {
        System.out.println("兔子两条腿跑~~~~");
    }
}