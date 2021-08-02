package com.kuang._06冒泡排序;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,7};
        int index = binarySearch(arr, 88);
        System.out.println(arr[index]);

    }
    
    private static int binarySearch(int[] arr, int number){
        int start = 0;
        int end = arr.length -1;
        
        while (start <= end){
            // 得到中间元素小标
            int mid = (start + end) /2;

            // 如果number 大于 中间元素，就让右边找
            if (number > arr[mid]){
                start = mid + 1;
            }else if (number < arr[mid]){
                end = end + 1;
            }else if (number == arr[mid]){
                return  mid;
            }
        }
        return -1;
    }
}
