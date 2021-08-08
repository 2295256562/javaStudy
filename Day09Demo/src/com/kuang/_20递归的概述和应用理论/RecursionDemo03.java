package com.kuang._20递归的概述和应用理论;

public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return f(x - 1) - 2;
        }
    }
}
