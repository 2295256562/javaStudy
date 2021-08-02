package com.kuang._06冒泡排序;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{55,22, 99,88};

        // 外层循环控制循环次数
        for (int i = 0; i < arr.length -1; i++) {
            System.out.println("j===>" + arr[i]);
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j+1]){
                    int temp = arr[j +1 ];
                    arr[j +1 ] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("数组：" + Arrays.toString(arr));
    }
}
