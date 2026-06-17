package com.devraj.maths;

import java.util.Scanner;

public class PrimeNumberTillN {
    public static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
