package com.kuang._02抽象类的使用;

/**
 * 目标：抽象类的使用
 *
 * 抽象类的作用：为了被子类继承
 *
 * 小结：
 *      抽象类是为了被子类继承，约束子类要重写抽象方法。
 *      注意：一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义为抽象类。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.work();

        Manger manger = new Manger();
        manger.work();
    }
}

// 需求：一家公司开发员工管理系统
abstract class Employee {
    // 父类知道子类都要完成工作，但是每个子类的工作内容不一样，这种场景就定义成抽象方法
    public abstract void work();
}

class Teacher extends Employee {
    @Override
    public void work() {
        System.out.println("讲师需要讲课~~");
    }
}

class Manger extends Employee {

    @Override
    public void work() {
        System.out.println("班主任需要管理学生~~~");
    }
}