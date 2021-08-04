package com.kuang._06原子性;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * 目标： 保证原子性操作的方案二：使用原子类，性能高效，线程安全
 *        java.util.concurrent.atomic;
 *
 *
 * 小结：
 *      使用原子类保证原子性操作，从而实现线程安全
 *
 *      为什么使用原子类可与保证原子性操作，且性能好，而且线程安全呢？
 *             底层基于CAS乐观锁机制，每次修改数据不会加锁，等到修改的时候判断有没有别人修改了！
 */
public class VolatileActomicDemo03 {
    public static void main(String[] args) {
        MyRunnale3 target = new MyRunnale3();

        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
    }
}


class MyRunnale3 implements Runnable {
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("count ==========>>>> " + atomicInteger.incrementAndGet());
        }
    }
}