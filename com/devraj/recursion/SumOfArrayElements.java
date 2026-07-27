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
