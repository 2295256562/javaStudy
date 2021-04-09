package com.kuang._09单例设计模式;

/**
 * 什么是单例？
 *      单例的意思是一个类永远只存在一个对象，不能创建多个对象。
 *  为什么要用单例？
 *      开发中很多类的对象我们只需要一个，虚拟机对象！任务管理器对象！
 *      对象越多越占内存，有写时候只需要一个对象就可以实现业务，单例可以节约内存，提高性能！
 *
 *  如何实现单例？
 *      1. 饿汉单例设计模式：
 *          - 通过类获取单例对象的时候，对象已经提前做好了！ （你去肯德基点餐一个汉堡，服务员直接给你汉堡）
 *              -- 通过类获取单例对象的时候，对象已经提前做好！
 *              -- 实现步骤;
 *                  1. 定义一个单例类
 *                  2. 把类的构造器私有
 *                  3. 定义一个静态成员变量用来存储一个对象（饿汉单例在返回对象的时候，对象要已经做好的）
 *                  4. 定义一个方法返回单例对象
 *
 *      2. 懒汉单例设计模式：
 *          - 通过类获取单例对象的时候发现没有对象才去创建一个对象 （你去餐馆点菜吃饭，你点完菜厨师菜开始炒菜）
 *          -- 实现步骤：
 *              1. 定义一个单例类
 *  *           2. 把类的构造器私有
 *  *           3. 定义一个静态成员变量用来存储一个对象。（懒汉单例不能直接创建对象，必须需要的时候才创建）
                4. 定义一个方法返回单例对象，判断对象是否存在，不存在则创建，存在直接返回。
 */
public class SingleInstanceDemo01 {
    public static void main(String[] args) {
        SingleIntance01 intance01 = SingleIntance01.getInstance();
        SingleIntance01 instance02 = SingleIntance01.getInstance();
        System.out.println(intance01 == instance02);
    }
}

class SingleIntance01 {

    // 2. 定义一个静态成员变量用于存储一个对象！（饿汉单例在返回对象的时候，对象要已经做好的）
    public static SingleIntance01 ins = new SingleIntance01();

    // 1. 把类的构造器私有，构造器只能在本类访问
    private SingleIntance01 (){}

    // 3. 提供一个方法返回单例对象
    public static SingleIntance01 getInstance(){
        return ins;
    }
}


class SingleIntance02 {
    // 2. 定义一个静态成员变量用于存储一个对象
    public static SingleIntance02 ins;

    // 1. 构造器私有
    private SingleIntance02 () {}

    // 3.通过方法返回一个对象，不存在对象才创建一个返回
    public static SingleIntance02 getInstance() {
        if (ins==null) {
            // 第一次来取对象，创建一个对象
            ins = new SingleIntance02();
        }
        return ins;
    }
}