package com.kuang._06原子性;


/**
 * 什么是原子性？
 *      原子性，是指一批操作是一个整体，要么同时成功，要么同时失败，不能被干扰
 *
 * volatile 只能保证线程间变量的可见性，但是不能保证变量操作的原子性
 */
public class VolatileActomicDemo01 {
    public static void main(String[] args) {
        MyRunnale target = new MyRunnale();

        for (int i = 0; i < 100; i++) {
            new Thread(target).start();
        }
    }
}


class MyRunnale implements Runnable{
    private volatile int count;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("count ==========>>>> " + count);
        }
    }
}