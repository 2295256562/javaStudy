package com.kuang._02多线程常用API;

/**
 * Thread类的API
 *      1. public void setName(String name): 给当前线程取名字
 *      2. public void getName: 获取当前线程的名字
 *          -- 线程存在默认名称，子线程的默认名称是：Thread_索引
 *          -- main线程默认名称是main
 *      3. public static Thread currentThread：获取当前线程对象
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 3. 创建一个线程对象
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        // 4. 调用线程对象的start()方法启动线程，最终还是只想run()方法
        thread1.start();
        thread1.setName("神州一号");

        thread2.start();
        thread2.setName("天宫一号");


        for (int i = 0; i < 100; i++) {
            System.out.println("main线程 == >" + i);
        }

    }
}

// 1. 定义一个线程类继承Thread类
class MyThread extends Thread {

    // 2.重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( currentThread().getName() + "子线程 == >" + i);
        }
    }
}