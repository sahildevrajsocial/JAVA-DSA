package com.devraj.maths;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number = sc.nextInt();

        int largest = 0;
        while(number > 0) {
            if(number % 10 > largest) {
                largest = number % 10;
            }
            number /= 10;
        }
        System.out.println(largest);
    }
}
