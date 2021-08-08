package com.kuang._20递归的概述和应用理论;

/**
 * 递归的三要素：
 *      1. 递归的终结点
 *      2. 递归的公式：f(x) = f(x-1) + 1
 *      3. 递归的方向；必须走向终结点
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int x){
        if (x == 1){
            return 1;
        }else {
            return  f(x -1)  + 1;
        }
    }
}
