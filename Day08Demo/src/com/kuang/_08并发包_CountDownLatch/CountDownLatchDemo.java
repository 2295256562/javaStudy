package com.kuang._08并发包_CountDownLatch;

import java.util.concurrent.CountDownLatch;


/**
 *   需求：
 *      提供A线程，打印 A , C
 *      提供B线程，打印 B
 *
 *  构造器：
 *      public CountDownLatch(int count)  // 初始化唤醒需要的down几步
 *  方法：
 *      public void await() throws InterruptedException  // 让当前线程等待，必须down
 *      public void countDown // 计数器进行减1 （down 1）
 *
 *  小结：
 *      countDownLatch可以控制线程在执行的过程等待自己，让其他线程执行完成后唤醒自己
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        // 创建一个countDownLatch对象用于监督A，B线程的执行情况
        CountDownLatch c = new CountDownLatch(1);
        new ThreadA(c).start();
        new ThreadB(c).start();
    }
}

class ThreadA extends Thread {
    private CountDownLatch c;

    public ThreadA(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("A");
        try {
            // 等到自己根据监督者中的数量决定让当前线程让出CPU等待自己
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}

class ThreadB extends Thread {
    private CountDownLatch c;

    public ThreadB(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("B");
        c.countDown();
    }
}

