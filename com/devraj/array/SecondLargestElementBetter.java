package com.devraj.array;

class SecondLargestBetter {
    public int SecondLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}

public class SecondLargestElementBetter {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,3,2,6,7,8,4,5,0,4,5};
        SecondLargestBetter slb = new SecondLargestBetter();
        System.out.println(slb.SecondLargest(arr));
    }
}
