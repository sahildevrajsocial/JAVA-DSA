package com.devraj.recursion;

import java.util.*;

class PrintingNTo1 {
    int count = 1;
    public void func(int n) {
        if(n == 0) return;
        System.out.println(n--);
        func(n);
    }
}

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:-");
        int n = sc.nextInt();
        System.out.println("Numbers from N to 1 are:- ");
        PrintingNTo1 print = new PrintingNTo1();
        print.func(n);
    }
}
