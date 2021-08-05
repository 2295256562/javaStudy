package com.kuang._09并发包_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {

        // 1. 创建一个循环屏障对象，等待5个线程执行完毕以后触发一次线程任务，meeting
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Meeting());
        // 2.创建一个任务循环屏障对象
        for (int i = 1; i <= 5; i++) {
            new EmployeeThread("员工" + i, cyclicBarrier).start();
        }
    }
}

class Meeting implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始会议....");
    }
}

class EmployeeThread extends Thread{

    private CyclicBarrier cyclicBarrierl;

    public EmployeeThread(String threadName, CyclicBarrier cyclicBarrier) {
        super(threadName);
        this.cyclicBarrierl = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "进入会议室~~~");
        try {
            cyclicBarrierl.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}