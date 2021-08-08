package com.kuang._20递归的概述和应用理论;


/**
 *  需求： 求 1 -n的和
 *       f(x) = 1 + 2 + 3 + 4 + 5 + ...x -1 + x
 *       f(x) = f(x -1) + n;
 *
 *  程序运行流程：
 *      f(5) = f(4) + 5  =  1 + 2 + 3 + 4 + 5
 *      f(4) = f(3) + 4  =  1 + 2 + 3 + 4
 *      f(3) = f(2) + 3  =  1 + 2 + 3
 *      f(2) = f(1) + 2  =  1 + 2
 *      f(1) = 1
 *
 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return f(x -1) + x;
        }
    }
}
