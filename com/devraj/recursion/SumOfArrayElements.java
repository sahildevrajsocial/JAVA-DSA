package com.devraj.recursion;

import java.util.Scanner;

class SumOfArray {

    private int func(int i, int[] arr) {
        if(i >= arr.length) return 0;

        return arr[i]+func(i+1, arr);
    }

    public int arraySum(int[] arr) {
        return func(0, arr);
    }
}

// here 0 in arraySum(0, arr) is used to pass it to the private int func that is func(int i, int[] arr), which is later
// used to call itself by i+1 that is return arr[i]+func(i+1, arr)

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter value of index " + i + " :-");
            arr[i] = sc.nextInt();
        }
        SumOfArray soa = new SumOfArray();
        System.out.print(soa.arraySum(arr));
    }
}
