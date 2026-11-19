package com.devraj.array;
import java.util.*;

class SecondLargestBrute {
    public int secondLargestBrute(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secondLargest = -1;
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }
}

public class SecondLargestElementBrute {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        SecondLargestBrute slb = new SecondLargestBrute();
        System.out.println(slb.secondLargestBrute(arr));
    }
}
