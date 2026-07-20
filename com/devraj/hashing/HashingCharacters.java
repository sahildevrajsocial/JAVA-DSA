package com.devraj.hashing;

import java.util.*;

public class HashingCharacters {
    public static void main(String[] args) {
        //Take size of an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:- ");
        int size = sc.nextInt();
        char[] arr = new char[size];

        //Take input of character array
        for(int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        //See output of character array
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Sort the array to get maxElement
        Arrays.sort(arr);
        int maxElement = arr[size-1];

        //Make a new hash array and use maxElement + 1 as its size
        int[] hash = new int[maxElement+1];
        for(int i = 0; i < size; i++) {
            hash[arr[i]]++;
        }

        //Taking number of quries and remaining a while loop til q-->0 where we take number to check frequency, under
        //which we make an if else condition where if num is greater than 0 and less than the size of hash, it will print
        //frequency of that num

        System.out.print("Enter numbers of queries:- ");
        int q = sc.nextInt();

        while(q--> 0) {
            System.out.print("Enter character to check frequency:- ");
            char charac = sc.next().charAt(0);
            if(charac > 0 && charac < hash.length) {
                System.out.println(hash[charac]);
            }
            else {
                System.out.println("outta range");
            }
        }
    }
}
