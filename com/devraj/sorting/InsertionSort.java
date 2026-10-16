package com.devraj.sorting;
import java.util.*;

class InsertionSorted {
    public int[] insertionSort(int[] arr) {
        for(int i = 0; i <= arr.length-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        InsertionSorted is = new InsertionSorted();
        System.out.println(Arrays.toString(is.insertionSort(arr)));
    }
}
