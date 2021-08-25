package com.kuang._08线程同步_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;

    // 创建一把锁对象: 因为账户对于小明和小红是唯一的，所以这里的锁对象对应小明小红也是唯一的一把锁
    private final Lock lock = new ReentrantLock();

    /**
     * 取钱
     *
     * @param money 取钱数量
     */
    public void drawMoney(double money) {
        // 开始判断取钱逻辑
        // 1.先知道谁来取钱
        String name = Thread.currentThread().getName();

        lock.lock();  // 上锁~~
        // 2.判断余额是否足够
        try {
            if (this.money >= money) {
                // 3. 余额足够
                System.out.println(name + "来取钱，余额足够，吐出" + money);
                // 4. 更新余额
                this.money -= money;
                // 5. 输出结果
                System.out.println(name + "来取钱后，余额剩余" + this.money);
            } else {
                // 6.余额不足
                System.out.println(name + "来取钱，余额不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // 解锁~~
        }
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
