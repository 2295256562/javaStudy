package com.kuang._06线程同步_同步代码块;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明  小红
        acc.drawMoney(1000000);
    }
}
