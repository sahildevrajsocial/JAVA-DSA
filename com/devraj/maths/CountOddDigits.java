package com.devraj.maths;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        int count = 0;
        int divisor = 10;
        while(num > 0) {
            if(num%divisor != 0) {
                count++;
            }
            divisor *= 10;
        }
        System.out.println(count);
    }
}
