package com.kuang._02多态的优劣势;

/**
 *   多态的优劣势
 *
 *    优势：
 *        1. 在多态形势下，右边对象可以实现组件化切换，业务能力也随之改变，便于拓展和维护。可以实现类与类之间的解耦。
 *        2. 实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法可以传入一切子类对象进行方法调用，更能体现出多态的拓展性与便利。
 *    劣势：
 *        1. 多态形势下，不能直接调用子类特有的功能。编译看左边，左边父类中没有子类独有的功能，所以代码在编译阶段就直接报错了。
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        // 父类类型  对象  子类构造器
        Animal animal = new Cat();
        animal.run();
    }

    public static void go(Animal a){
        System.out.println("开始~~~~");
    }
}


class Animal {
    public void run() {
        System.out.println("动物会跑~~~");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("猫跑的很快~~~~");
    }
}