package com.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author sunlichao
 */
public class QuickSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end, x = arr[i + j >> 1];
        while (i < j) {
            while (arr[i] < x) i++;
            while (arr[j] > x) j--;
            if (i < j) swap(arr, i, j);
        }
        sort(arr, start, j);
        sort(arr, j + 1, end);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
