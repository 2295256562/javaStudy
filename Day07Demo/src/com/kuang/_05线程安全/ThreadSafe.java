package com.kuang._05线程安全;


/**
 * 线程安全问题
 */
public class ThreadSafe {
    public static void main(String[] args) {

        Account acc = new Account("ICBC-1999", 1000000);
        DrawThread t1 = new DrawThread(acc, "小明");
        t1.start();


        DrawThread t2 = new DrawThread(acc, "小红");
        t2.start();

    }
}
