package com.sort;

/**
 * @author sunlichao
 */
public class HeapSort {
    public static void sort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for (int i = arr.length / 2; i >= 0; i--) {
           adjustHeap(arr,i,arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
           swap(arr,0,i);
           adjustHeap(arr,0,i);
        }
    }
    private static void adjustHeap(int[] arr,int parent,int length){
        int temp = arr[parent];
        int lC = 2 * parent + 1;
        while (lC < length){
            int rC = lC + 1;
            if(rC < length && arr[rC] > arr[lC]){
                lC++;
            }
            if(temp > arr[lC]){
                break;
            }
            arr[parent] = arr[lC];
            parent = lC;
            lC = 2 * lC + 1;
        }
       arr[parent] = temp;
    }
    private static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
