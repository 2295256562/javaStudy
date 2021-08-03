package com.kuang._06线程同步_同步代码块;

public class Account {
    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * 取钱
     * @param money 取钱数量
     */
    public void drawMoney(double money) {
        // 开始判断取钱逻辑
        // 1.先知道谁来取钱
        String name = Thread.currentThread().getName();
        // 2.判断余额是否足够
        synchronized (this){
            if (this.money >= money) {
                // 3. 余额足够
                System.out.println(name + "来取钱，余额足够，吐出" + money);
                // 4. 更新余额
                this.money -= money;
                // 5. 输出结果
                System.out.println(name + "来取钱后，余额剩余" + this.money);
            }else {
                // 6.余额不足
                System.out.println(name + "来取钱，余额不足");
            }
        }

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
