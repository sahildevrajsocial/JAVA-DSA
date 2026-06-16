package com.devraj.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();

        int revNum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            revNum = (revNum * 10) + lastDigit;
            number /= 10;
        }
        System.out.print(revNum);
    }
}
