package com.kuang._00编程思维题目;

/**
 * @author xinman.kuang
 * @date 2021/8/8 20:12
 * <p>
 * 目标：非规律化递归问题，编程思维的拓展
 * <p>
 * 啤酒问题：啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
 */
public class BeerDemo01 {
    // 定义一个静态变量存储可以喝酒的总数
    public static int totalNum;
    public static int lastPingZiNum;
    public static int lastGaiZiNum;

    public static void main(String[] args) {
        buyBeer(20);
        System.out.println("买酒数：" + totalNum);
        System.out.println("剩余瓶子数：" + lastPingZiNum);
        System.out.println("剩余盖子数：" + lastGaiZiNum);
    }

    // 定义一个方法帮助用户买酒
    public static void buyBeer(int money) {
        // 根据money买酒得到买酒数据
        int number = money / 2;
        // 酒数量 += 本轮买酒数量
        totalNum += number;

        // 算出当前剩余瓶子和盖子数，换成金额继续买酒
        // 当前瓶子数等于 剩余瓶子数 + 当前酒的数量(一瓶酒一个盖子)
        int currentPingZiNum = lastPingZiNum + number;
        int currentGaiZiNum = lastGaiZiNum + number;

        // 把剩余瓶子和盖子换算成为买酒的金额
        int totalMoney = 0;
        // 当前剩余瓶子数 / 2 得到可以换几瓶酒，已知一瓶酒2元，所以可以算出可以换算多少钱
        totalMoney += (currentPingZiNum / 2) * 2;
        // 当前剩余盖子数 / 4 等到可以换几瓶酒，每瓶酒2元
        totalMoney += (currentGaiZiNum / 4) * 2;

        // 等到剩余的盖子
        lastPingZiNum = currentPingZiNum % 2;
        lastGaiZiNum = currentGaiZiNum % 4;

        // 可以拿钱继续买酒
        if (money >= 2){
            buyBeer(totalMoney);
        }
    }
}
