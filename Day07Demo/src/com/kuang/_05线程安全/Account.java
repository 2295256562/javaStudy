package com.kuang._05线程安全;

public class Account {
    private String cardId;
    private double money;

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

    /**
     * 取钱
     * @param i 取钱数量
     */
    public void drawMoney(int money) {
        // 开始判断取钱逻辑
        // 1.先知道谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        if (this.money >= money) {
            System.out.println(name + "来取钱，余额足够，吐出" + money);
            this.money -= money;
            System.out.println(name + "来取钱后，余额剩余" + this.money);
        }else {
            System.out.println(name + "来取钱，余额不足");
        }

    }
}
