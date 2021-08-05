package com.kuang._10并发包_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * 目标：Semaphore的使用介绍
 *
 * 引入：
 *      Semaphore(发信号)的主要作用是控制线程并发占锁的数量
 *      synchronized可以起到“锁”的作用，但是某个时间段内，只能有一个线程允许执行。
 *      Semaphore可以设置同时允许几个线程执行。
 *      Semaphore字面意思是信号量的意思，他的作用是控制访问特定资源的线程数目。
 *
 * Semaphore的构造器：
 *      public Semaphore(int permits): permits表示许可线程的数量
 *      public Semaphore(int permits, boolean fair): fair表示公平性，如果这个设为true
 * Semaphore的方法：
 *      public void acquire() throws InterruptedException 表示获取许可
 *      public void release() release() 表示释放许可
 *
 * 小结：
 *      Semaphore可以控制线程并发占锁的数量
 */
public class SemaphoreDemo {
    public static void main(String[] args) {

        Service service = new Service();

        for (int i = 0; i < 5; i++) {
            new ThreadA("用户" + i, service ).start();
        }

    }
}

class ThreadA extends Thread{
    private Service service;


    public ThreadA(String s, Service service) {
        super(s);
        this.service = service;
    }

    @Override
    public void run() {
        service.login();
    }
}


class Service {
    Semaphore semaphore = new Semaphore(3);

    public void login(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +"进入系统 == " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "登录成功");
        System.out.println(Thread.currentThread().getName() +"离开系统 == " + System.currentTimeMillis());

        semaphore.release();
    }
}
