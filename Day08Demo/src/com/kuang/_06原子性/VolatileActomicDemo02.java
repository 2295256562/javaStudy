package com.kuang._06原子性;


/**
 * 目标： 保证原子性操作的方案一：加锁
 *
 *
 * 加锁机制性能较差。
 */
public class VolatileActomicDemo02 {
    public static void main(String[] args) {
        MyRunnale1 target = new MyRunnale1();

        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
    }
}


class MyRunnale1 implements Runnable{
    private int count;

    @Override
    public void run() {
        synchronized ("!1"){
            for (int i = 0; i < 100; i++) {
                count++;
                System.out.println("count ==========>>>> " + count);
            }
        }
    }
}