package com.devraj.sorting;
import java.util.*;

class SelectionSorted{
    public int[] selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length-2; i++) {
            int min = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] <= arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,5};
        SelectionSorted ss = new SelectionSorted();
        System.out.println(Arrays.toString(ss.selectionSort(arr)));
    }
}
