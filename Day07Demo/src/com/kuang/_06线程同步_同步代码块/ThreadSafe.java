package com.kuang._06线程同步_同步代码块;



/**
 * 线程同步解决线程安全问题的核心思想
 *     让多个线程实现先后依次访问共享资源，这样就解决了安全问题
 *
 * 线程同步的做法：加锁
 *     是把共享资源进行上锁，每次只能一个线程进入访问完毕后，其他线程才能进来
 *
 * 线程同步的方式有三种：
 *    1. 同步代码块
 *    2. 同步方法
 *    3. lock显示锁
 *
 *
 * A.同步代码块
 *      作用：把出现线程安全问题的核心代码给上锁，每次只能一个线程进入，执行完毕以后自动解锁，其他线程才能进来执行
 *
 *      格式：
 *          synchronized(锁对象){
 *              // 访问共享资源的核心代码
 *          }
 *
 *         锁对象：理论上可以是人员的 "唯一"对象即可
 *         原则上：锁对象建议使用共享资源
 *              -- 在实例方法中建议用this作为锁对象，此时this正好是共享资源,必须代码高度面向对象
 *              -- 在静态方法中建议用类名.class字节码作为锁对象
 *
 */
public class ThreadSafe {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-1999", 1000000.00);
        DrawThread t1 = new DrawThread(acc, "小明");
        t1.start();


        DrawThread t2 = new DrawThread(acc, "小红");
        t2.start();


    }
}
