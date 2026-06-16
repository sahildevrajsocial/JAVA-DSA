package com.devraj.maths;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();
        int copy = number;
        int revNum = 0;
        while(copy > 0) {
            int lastDigit = copy % 10;
            revNum = (revNum * 10) + lastDigit;
            copy /= 10;
        }
        if(number == revNum) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
