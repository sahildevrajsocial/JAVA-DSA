package com.devraj.array;
import java.util.*;

class LargestElementOp {
    public int func(int[] arr) {
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
}

public class LargestElementOptimal {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        LargestElementOp le = new LargestElementOp();
        System.out.println(le.func(arr));
    }
}
