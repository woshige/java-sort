package com.sort;

/**
 * 希尔排序
 *
 * @author sunlichao
 */
public class ShellSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
           return;
        }
        int length = arr.length;
        for (int i = length / 2; i > 0; i /= 2) {
            for (int j = i; j < length; j += i) {
               int cur = arr[j];
               int preIndex = j - i;
               while (preIndex >= 0 && arr[preIndex] > cur){
                   arr[preIndex + i] = arr[preIndex];
                   preIndex -= i;
               }
               arr[preIndex + i] = cur;
            }
        }
    }
}
