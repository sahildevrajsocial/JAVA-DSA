package com.devraj.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            char ch = 'A';
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if(j < i) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
