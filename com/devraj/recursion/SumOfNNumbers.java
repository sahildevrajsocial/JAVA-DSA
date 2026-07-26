package com.devraj.recursion;

import java.util.Scanner;

class SumOfN {
    public int func(int n) {
        if(n == 0) return 0;
        return n + func(n - 1);
    }
}

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        SumOfN sum = new SumOfN();
        System.out.println(sum.func(n));
    }
}
