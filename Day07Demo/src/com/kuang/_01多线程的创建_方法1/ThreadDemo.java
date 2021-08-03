package com.kuang._01多线程的创建_方法1;

/**
 * 创建线程的三种方式：
 *     1. 直接定义一个类继承Thread，重写run方法，创建线程对象调用线程对象的start()方法来启动。
 *     2. 定义一个线程任务实现Runnable接口，重写run()方法，创建线程任务对象，把线程任务对象保证成线程对象，调用线程对象的start()方法启动线程
 *     3. 实现callable接口
 *
 *
 *     继承Thread类的优缺点：
 *          优点：编码简单
 *          缺点：线程类已经继承了Thread类无法继承其他类，功能不能通过继承拓展(单继承的局限性)
 *
 *     小结：
 *          线程类是继承了Thread的类
 *          启动线程必须调用start()方法
 *          多线程是并发抢占cpu执行，所有在执行过程中
 *
 *     多线程注意事项：
 *          1. 线程的启动必须调用start()方法，否则被当成普通类处理
 *          2. 建议线程先注册子线程，主线程任务放在之后
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 3. 创建一个线程对象
        MyThread myThread = new MyThread();
        // 4. 调用线程对象的start()方法启动线程，最终还是只想run()方法
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main线程 == 》" + i);
        }

    }
}

// 1. 定义一个线程类继承Thread类
class MyThread extends Thread {

    // 2.重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程" + i);
        }
    }
}