package com.kuang._01线程通信;


/**
 * 注意： 线程通信一定是多个线程在执行同一个资源才需要通信
 *       线程通信必须先保证通信安全，否则毫无意义，代码也会报错！
 *
 * 线程通信的object提供的方法：
 *      -- public void wait(): 让当前线程进入等待状态 此方法必须锁对象调用
 *      -- public void notify(): 唤醒当前锁对象上等待状态的某个线程  此方法必须锁对象调用
 *      -- public void notifyAll()： 唤醒当前锁对象上等待状态的全部线程  此方法必须锁对象调用
 */
public class ThreadCommunication {
    public static void main(String[] args) {
        Account account = new Account("ICBM_100", 0);
        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();


        new SaveThread(account, "亲爹").start();
        new SaveThread(account, "干爹").start();
        new SaveThread(account, "岳父").start();

    }
}
