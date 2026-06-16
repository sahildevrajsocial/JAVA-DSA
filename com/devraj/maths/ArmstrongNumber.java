package com.devraj.maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();

        int sum = 0;
        int count = (int)(Math.log10(number)+1);
        int duplicateNum = number;

        while(number > 0) {
            int lastDigit = number % 10;
            sum += (int)(Math.pow(lastDigit, count));
            number /= 10;
        }
        System.out.println(duplicateNum == sum);
    }
}
