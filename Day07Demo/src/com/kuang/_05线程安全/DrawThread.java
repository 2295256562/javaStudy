package com.kuang._05线程安全;

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
