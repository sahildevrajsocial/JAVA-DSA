package com.devraj.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2 * n - 1) - (2 * i)); j++) {
                System.out.print("*");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
