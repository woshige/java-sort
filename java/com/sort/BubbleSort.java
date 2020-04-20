package com.sort;

/**
 * 冒泡排序算法
 * @author sunlichao
 */
public class BubbleSort {
    public static void sort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr,j,j + 1);
                }
            }
        }
    }
    private static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
