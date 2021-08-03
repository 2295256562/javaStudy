package com.kuang._02多线程常用API;

/**
 * 通过Thread类的有参构造器为当前线程对象取名字
 *      -- public Thread()
 *      -- public Thread(String name)：创建线程对象并取名字
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02("1号线程");
        myThread02.start();
    }
}


class MyThread02 extends Thread{

    public MyThread02(String name) {
        // 调用父类的有参构造器初始化当前线程对象的名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(currentThread().getName() + "子线程 == >" + i);
        }
    }
}