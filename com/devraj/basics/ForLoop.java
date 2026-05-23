package com.devraj.basics;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int i;

        for(i = 0; i<5; i++) {
            System.out.println("Sahil Devraj");
        }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(i = 0; i<=size-1; i++) {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i<=size-1; i++) {
            System.out.println(arr[i]);
        }

        for(int num:arr) {
            System.out.println(num);
        }
    }
}