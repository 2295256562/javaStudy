package com.kuang._04Volatile关键字概述;


/**
 * 目标： 并发编程下，多线程访问变量的不可见性问题
 *
 * 引入：
 *      多线程访问共享变量，会出现一个线程修改变量的值后，其他线程看不到变量最新值的情况。
 *
 * 结论：
 *      并发编程下，多线程修改变量，会出现线程间变量不可见性
 * 不可见性的原因：
 *      每个线程都有自己的工作内存，线程都是从主内存拷贝共享变量的副本值
 *      每个线程是在自己的工作内存中操作共享变量的。
 */
public class VolatileDemo1 extends Thread{

    private boolean flage = false;

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

        while (true){
            if (t1.isFlage()){
                System.out.println("主线程开始执行~~~~");
            }
        }
    }
}