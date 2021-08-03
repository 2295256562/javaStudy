package com.kuang._01线程通信;

public class Account {
    private String cardId;
    private double money;

    public Account() {
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

    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();

        try {
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name + "来取钱，取钱：" + money + "剩余：" + this.money);
                // 取钱后没钱了，等待自己唤醒别人
                this.notifyAll();
                this.wait();
            } else {
                // 4. 余额不足
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void saveMoney(double money) {

        try {
            // 谁来存钱
            String name = Thread.currentThread().getName();

            // 1. 判断余额是否足够
            if (this.money > 0) {
                // 2. 有钱了，唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {
                // 4. 余额不足
                this.money += money;
                System.out.println(name + "来存钱" + money);
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
