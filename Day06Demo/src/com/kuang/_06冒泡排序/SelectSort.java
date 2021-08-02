package com.kuang._06冒泡排序;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{55,22, 99,88};

        // 1.定义一个循环控制循环次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 2.定义一个循环控制每轮比较几次，一定是以当前位置与后面元素比较
            // i = 0; j= 1 2 3
            // i = 1; j = 2 3
            // i = 2; j = 3
            for (int j = i +1; j <arr.length; j ++){
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
