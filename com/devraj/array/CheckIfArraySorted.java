package com.devraj.array;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        int pointer = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(pointer > arr[i]) {
                System.out.println("False");
                break;
            }
            pointer = arr[i];
        }
        System.out.println("True");
    }
}
