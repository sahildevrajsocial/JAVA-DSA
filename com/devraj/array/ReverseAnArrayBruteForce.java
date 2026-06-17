package com.devraj.array;

import java.util.Arrays;

public class ReverseAnArrayBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            temp[arr.length - i - 1] = arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
