package com.devraj.recursion;

import java.util.Scanner;

class Factorial {
    int count = 1;
    int fact = 1;
    public int func(int n) {
        if(count > n) return fact;
        fact = count * fact;
        count++;
        return func(n);
    }
}

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        Factorial factorial = new Factorial();
        System.out.println(factorial.func(n));
    }
}
