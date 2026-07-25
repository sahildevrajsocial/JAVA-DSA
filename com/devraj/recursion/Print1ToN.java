package com.devraj.recursion;

import java.util.Scanner;

class Printing1ToN {
    int count = 1;
    public void func(int n) {
        if(n == 0) return;
        System.out.println(count++);
        func(n-1);
    }
}

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        Printing1ToN print = new Printing1ToN();
        print.func(n);
    }
}
