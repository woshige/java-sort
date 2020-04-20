package com.sort;

public class SimpleInsertSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int temp = arr[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && arr[preIndex] > temp){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = temp;
        }
    }
}
