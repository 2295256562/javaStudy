package com.kuang._08线程同步_Lock锁;


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
 * c. lock显示锁
 *      java.util.concurrent.locks.Lock;机制提供了比synchronize代码块和synchronize方法更强大的功能
 *
 *      Lock锁也称同步锁，加锁与释放锁方法化了，如下：
 *          -- public void lock() : 加同步锁
 *          -- public void unlock() ：释放同步锁
 *
 * 总结：
 *      线程安全，性能差
 *      线程不安全性能好。开发中不存在线程安全问题，建议使用线程不安全的设计类。
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
