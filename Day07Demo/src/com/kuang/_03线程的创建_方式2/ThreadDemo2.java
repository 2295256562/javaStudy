package com.kuang._03线程的创建_方式2;

/**
 *  简化方式2的写法
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(currentThread().getName() + " == > " + i);
                }
            }
        }.start();
    }
}
