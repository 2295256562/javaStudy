package com.kuang._05变量不可见性解决;


/**
 * 目标： 并发编程下变量不可见性解决方案
 *
 * 现象：并发编程下，多线程修改变量，会出现线程间变量不可见性。
 *
 * 解决方案有两种常见方式：
 *      1. 加锁
 *          -- 每次加锁会情况线程自己的工作内存，从新读取主内存最新值。
 *      2. 对共享的变量进行volatile关键字修饰
 *          -- volatile修饰的变量可以在多线程并发修改下，实现线程间变量的可见性。
 *          -- 一旦一个线程修改了volatile修饰的变量，另一个线程可以立马得到最新值。
 */
public class VolatileDemo1 extends Thread{

    private volatile boolean flage = false;

    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.flage = true;
        System.out.println("falg = " + flage);
    }
}

class ViabilityDemo {
    public static void main(String[] args) {
        VolatileDemo1 t1 = new VolatileDemo1();
        t1.start();

        // while (true){
        //     // 加锁会清空工作内存，读取主内存中最新值到工作内存中
        //     synchronized (ViabilityDemo.class){
        //         if (t1.isFlage()){
        //             System.out.println("主线程开始执行~~~~");
        //         }
        //     }
        // }
        while (true){
            if (t1.isFlage()){
                System.out.println("主线程开始执行~~~");
            }
        }
    }
}