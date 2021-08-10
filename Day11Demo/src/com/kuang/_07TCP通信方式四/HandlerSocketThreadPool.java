package com.kuang._07TCP通信方式四;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:56
 */
public class HandlerSocketThreadPool {
    // 得到系统线程池对象
    private ExecutorService executor;

    public HandlerSocketThreadPool(int maxPoolSize, int queueSize) {
        // 线程池对象等于ThreadPoolExecutor对象
        // 为executor 创建一个自定义线程
        executor = new ThreadPoolExecutor(
                maxPoolSize,
                maxPoolSize,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queueSize));
    }

    public void execute(Runnable task) {
        executor.execute(task);
    }
}
