package com.kuang._02线程池;


import java.util.concurrent.*;

/**
 * 线程池在java中的代表类：ExecutorService(接口)
 *
 * java在Executors类下提供一个静态方法得到一个线程池的对象:
 *      1. public static ExecutorService newFixedThreadPool(int nThreads):创建一个线程返回
 *
 * ExecutorService提交线程任务对象执行的方法：
 *      1. Future<?> submit(Runnable task): 提交一个Runnable的任务对象给线程池执行
 *      2. Future<?> submit(Callable task): 提交一个Runnable的任务对象给线程池执行
 */
public class ThreadPoolsDemo03 {
    public static void main(String[] args) {
        ExecutorService pools = Executors.newFixedThreadPool(3);

        // 2. 提交callable的任务对象后返回一个未来任务对象
        Future<String> t1 = pools.submit(new MyCallable(100));
        Future<String> t2 = pools.submit(new MyCallable(200));
        Future<String> t3 = pools.submit(new MyCallable(300));
        Future<String> t4 = pools.submit(new MyCallable(400));

        try {
            String res1 = t1.get();
            String res2 = t2.get();
            String res3 = t3.get();
            String res4 = t4.get();
            System.out.println(res1);
            System.out.println(res2);
            System.out.println(res3);
            System.out.println(res4);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行的结果是：" + sum;
    }
}
