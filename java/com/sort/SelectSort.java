package com.sort;

/**
 * 选择排序
 * @author sunlichao
 */
public class SelectSort {
    public static void sort(int[] arr){
       if(arr == null || arr.length == 0){
           return;
       }
       int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
               if(arr[i] > arr[j]){
                   swap(arr,i,j);
               }
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
