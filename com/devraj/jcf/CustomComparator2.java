package com.devraj.jcf;

import java.util.*;

public class CustomComparator2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        // sort it in the descending order
        // [num1, num2]
        // num1 < num2 -> wrong order swap, the numbers
        Collections.sort(al, (num1, num2) -> num2 - num1);
        System.out.println(al);
    }
}
