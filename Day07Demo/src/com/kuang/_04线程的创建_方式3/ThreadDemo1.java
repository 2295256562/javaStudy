package com.kuang._04线程的创建_方式3;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 线程的创建方式三： 实现callable接口
 *      -- 1. 创建一个线程任务类实现callable接口，申明线程返回的结果类型
 *      -- 2. 重写线程任务类的call方法
 *      -- 3. 创建一个callable的线程任务对象
 *      -- 4. 把callable任务对象包装成一个未来任务对象
 *      -- 5. 把未来任务对象包装成线程对象
 *      -- 6. 启动线程对象
 *
 * 优缺点：
 *   优点：全是优点
 *      -- 线程任务类只是实现Runnable接口，可以继续继承其他类，而且可以继续实现其他接口
 *      -- 同一个线程任务对象可以被包装成多个线程对象
 *      -- 适合多个相同的程序代码的线程去共享同一个资源
 *      -- 实现解耦操作，线程任务代码可以被多个线程共享，线程任务代码和线程独立
 *      -- 线程池可以放入实现Runnable或callable线程任务对象
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 3. 创建一个callable的线程任务对象
        MyThread03 call = new MyThread03();
        // 4. 把callable任务对象包装成一个未来任务对象
        //        -- public FutureTask(Callable<V> callable) {}
        // 未来任务对象是啥，有啥用？
        //        -- 未来任务对象其实就是一个Runnable对象；这样就可以被包装成线程对象
        //        -- 未来任务对象可以在线程执行完毕之后去得到线程执行的结果
        FutureTask<String> task = new FutureTask<>(call);
        // 5. 把未来任务对象包装成线程对象
        Thread t = new Thread(task);
        // 6. 启动线程对象
        t.start();

        // 获取线程执行的结果，如果线程没有结果，让出cpu等线程执行完再来取结果
        try {
            String s = task.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 1. 创建一个线程任务类实现callable接口，申明线程返回的结果类型
class MyThread03 implements Callable<String> {

    // 2. 重写线程任务类的call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " == >" + i);
            sum += i;
        }
        return Thread.currentThread().getName() + "执行的结果是：" + sum;
    }
}