package com.devraj.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class HashingANumber {
    public static void main(String[] args) {
        //Take size of an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Take array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //array output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //sort array to get maxElement
        Arrays.sort(arr);
        int maxElement = arr[n - 1];

        //make a new hash array and use maxElement+1 as its size
        int hash[] = new int[maxElement + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Taking number of quries and remaining a while loop til q-->0 where we take number to check frequency, under
        //which we make an if else condition where if num is greater than 0 and less than the size of hash, it will print
        //frequency of that num
        System.out.print("Enter number of queries:- ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.print("Enter number to check frequency:- ");
            int num = sc.nextInt();

            if (num > 0 && num < hash.length) {
                System.out.println(hash[num]);
            } else {
                System.out.print("number is outta range");
            }
        }
    }
}


