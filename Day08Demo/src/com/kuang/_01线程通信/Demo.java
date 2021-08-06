package com.kuang._01线程通信;

/**
 * 需求：
 * 用两个线程分别打印奇数和偶数， 输出 1- 10
 */
public class Demo {

    static Object object = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 1; i <= 10; i += 2) {
                        System.out.println("打印奇数" + i);
                        System.out.println("打印奇数" + (i += 1));
                        object.notifyAll();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 2; i <= 10; i += 2) {
                        System.out.println("打印偶数" + i);
                        object.notifyAll();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }).start();
    }
}
