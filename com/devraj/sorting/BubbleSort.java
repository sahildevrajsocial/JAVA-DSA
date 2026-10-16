package com.devraj.sorting;
import java.util.*;

class BubbleSorted {
    public int[] bubbleSort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] >= arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        BubbleSorted bs = new BubbleSorted();
        System.out.println(Arrays.toString(bs.bubbleSort(arr)));
    }
}
