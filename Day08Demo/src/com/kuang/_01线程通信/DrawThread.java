package com.kuang._01线程通信;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
            acc.drawMoney(10000);
        }
    }
}
