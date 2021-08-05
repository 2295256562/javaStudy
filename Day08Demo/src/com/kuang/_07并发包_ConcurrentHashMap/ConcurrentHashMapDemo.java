package com.kuang._07并发包_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 目标： 并发包的介绍 （面试的重点中的重点）
 * <p>
 *   Map集合中的经典集合：HashMap是线程不安全的，性能好
 *
 *   为了保证线程安全，可以使用Hashtable
 *      -- Hashtable是线程安全的Map集合，但性能较差
 *   为了保证线程安全，再看ConcurrentHashMap(不止线程安全，)
 *
 * 总结：
 *      HashMap是线程不安全的，性能好
 *      Hashtable 锁整个集合 线程安全，性能较差！！
 *      ConcurrentHashMap线程安全，性能得到极大提升！！ 分段式锁！只锁自己操作的元素位置，综合性能最好*
 */
public class ConcurrentHashMapDemo {

    // public static Map<String, String> maps = new HashMap<>();  //
    // public static Map<String, String> maps = new Hashtable<>();  // 线程安全，性能较差
    public static Map<String, String> maps = new ConcurrentHashMap<>();  // 线程安全，性能较差

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "线程1");
        Thread t2 = new Thread(myRunnable, "线程2");

        t1.start();
        t2.start();

        try {
            t1.join();  // 让t1执行完
            t2.join();  // 让t2执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 等两个线程执行完毕以后去获取集合最终的元素个数
        System.out.println("元素个数" + maps.size());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            ConcurrentHashMapDemo.maps.put(Thread.currentThread().getName() + i, i + "");
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒完成线程任务");
    }
}