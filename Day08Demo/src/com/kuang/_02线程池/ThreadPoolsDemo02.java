package com.kuang._02线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池在java中的代表类：ExecutorService(接口)
 *
 * java在Executors类下提供一个静态方法得到一个线程池的对象:
 *      1. public static ExecutorService newFixedThreadPool(int nThreads):创建一个线程返回
 *
 * ExecutorService提交线程任务对象执行的方法：
 *      1. Future<?> submit(Runnable task): 提交一个Runnable的任务对象给线程池执行
 */
public class ThreadPoolsDemo02 {
    public static void main(String[] args) {
        // 1. 创建一个线程池，指定线程的固定数量3
        ExecutorService pools = Executors.newFixedThreadPool(3);
        // 2. 添加线程任务让线程池处理
        MyRunnable target = new MyRunnable();
        pools.submit(target);   // 第1次提交任务，此时线程池创建新线程，自动触发执行
        pools.submit(target);   // 第2次提交任务，此时线程池创建新线程，自动触发执行
        pools.submit(target);   // 第3次提交任务，此时线程池创建新线程，自动触发执行
        pools.submit(target);   // 第4次提交任务，复用之前的线程

        // pools.shutdown();  // 等待任务执行完毕以后才会关闭线程池
        pools.shutdownNow();  // 立即关闭线程的代码，无论任务是否执行完毕
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " ===> " + i);
        }
    }
}