package com.kuang._03线程的创建_方式2;

/**
 *  实现 Runnable 接口的方式：
 *      1. 创建一个线程任务类实现 Runnable接口
 *      2. 重写 run() 方法
 *      3. 创建一个线程任务对象
 *      4. 把线程任务对象包装成线程对象
 *      5. 调用线程对象的start() 方法启动线程
 *
 *   Thread的构造器
 *      -- public Thread(){}
 *      -- public Thread(String name){}
 *      -- public Thread(Runnable target){}
 *      -- public Thread(Runnable target, String name){}
 *
 *   实现Runnable接口创建线程的优点：
 *      缺点：
 *        -- 代码复杂一点
 *        -- 不能直接得到执行结果
 *      优点：
 *        -- 线程任务类只是实现Runnable接口，可以继续继承其他类，而且可以继续实现其他接口
 *        -- 同一个线程任务对象可以被包装成多个线程对象
 *        -- 适合多个相同的程序代码的线程去共享同一个资源
 *        -- 实现解耦操作，线程任务代码可以被多个线程共享，线程任务代码和线程独立
 *        -- 线程池可以放入实现Runnable或callable线程任务对象
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3. 创建一个线程任务对象（注意：线程任务对象不是线程对象，只是执行线程的任务的）
        MyRunnable target = new MyRunnable();
        // 4. 把线程任务对象包装成线程对象，且可以指定线程名称
        Thread thread = new Thread(target, "1号线程");
        // 5. 调用线程对象的start()方法启动线程
        thread.start();

        Thread t2 = new Thread(target);
        t2.start();
    }
}


// 1. 创建一个线程任务类实现Runnable接口
class MyRunnable implements Runnable{
    // 2. 重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " == > " + i);
        }
    }
}
