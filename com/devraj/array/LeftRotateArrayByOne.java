package com.devraj.array;
import java.util.*;

class LeftRotateArray {
    public int[] Rotate(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LeftRotateArray lra = new LeftRotateArray();
        System.out.println(Arrays.toString(lra.Rotate(arr)));
    }
}
