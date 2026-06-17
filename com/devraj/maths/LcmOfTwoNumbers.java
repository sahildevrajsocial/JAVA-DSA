package com.devraj.maths;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1:- ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number 2:- ");
        int n2 = sc.nextInt();

        int largest = Math.max(n1, n2);
        int smallest = Math.min(n1, n2);

        int multiple = largest;
        while(true) {
            if(multiple % smallest == 0) {
                System.out.println(multiple);
                break;
            }
            multiple += largest;
        }
    }
}
