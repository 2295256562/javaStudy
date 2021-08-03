package com.kuang._02多线程常用API;

/**
 * 线程休眠API
 *     1. public void int sleep(int secore)
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
