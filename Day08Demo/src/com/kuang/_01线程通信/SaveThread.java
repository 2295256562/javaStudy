package com.kuang._01线程通信;

public class SaveThread extends Thread{

    private Account acc;

    public SaveThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        while (true){
            try {

            }catch (Exception e){
                e.printStackTrace();
            }
            acc.saveMoney(10000);
        }
    }
}
