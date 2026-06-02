package com.devraj.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        char el = (char) ('A' + n - 1);
        for(int i = 0; i < n; i++) {
            for(char ch = (char) (el - i); ch <= el; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
