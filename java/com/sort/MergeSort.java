package com.sort;

/**
 * 归并排序
 *
 * @author sunlichao
 */
public class MergeSort {
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
        int mid = start + ((end - start) >> 1);
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        int[] copy = new int[end - start + 1];
        int l = start, r = mid + 1, k = 0;
        while (l <= mid && r <= end) {
            if (arr[l] >= arr[r]) {
                copy[k++] = arr[r++];
            } else {
                copy[k++] = arr[l++];
            }
        }
        while (l <= mid) {
            copy[k++] = arr[l++];
        }
        while (r <= end) {
            copy[k++] = arr[r++];
        }
        for (int i = start,j = 0; i <= end; i++,j++) {
           arr[i] = copy[j];
        }
    }

}
