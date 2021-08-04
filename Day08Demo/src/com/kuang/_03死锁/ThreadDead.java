package com.kuang._03死锁;

/**
 * 死锁代码通常存在嵌套
 */
public class ThreadDead {
    public static Object res1 = new Object(){};
    public static Object res2 = new Object(){};

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res1){
                    System.out.println("进入线程1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res2){
                        System.out.println("线程1占领线程2");
                    }
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (res2){
                    System.out.println("进入线程2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1){
                        System.out.println("线程2占领线程1");
                    }
                }
            }
        }).start();

    }
}
