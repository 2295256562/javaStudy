package com.kuang._11并发包_Exchanger;

import java.util.concurrent.Exchanger;

/**
 *  Exchanger可以实现线程间的数据交换
 *  一个线程如果等不到对方的数据交换就会一直等待
 *  我们也可以控制一个线程等待的时间
 *  必须双方都进行交换才可以正常进行数据的交换
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();
        new Boy(exchanger).start();
        new Girl(exchanger).start();
    }
}


class Boy extends Thread{
    private Exchanger<String> exchanger;

    public Boy(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("男孩开始做好自己的定情信物：同心锁！");
        try {
            String rs = exchanger.exchange("同心锁");
            System.out.println("男孩子收到礼物：" + rs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Girl extends Thread{
    private Exchanger<String> exchanger;

    public Girl(Exchanger exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println("女生开始做好自己的定情信物：钥匙");
        try {
            String rs = exchanger.exchange("钥匙");
            System.out.println("女孩子收到礼物：" + rs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}