package com.devraj.jcf;

import java.util.*;

public class CommonAlgorithms {
    static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        Collections.sort(al);
        System.out.println("Sorted:- "+al);
        Collections.reverse(al);
        System.out.println("Reverse:- "+al);
        Collections.max(al);
        System.out.println("Max:- "+al);
        Collections.min(al);
        System.out.println("Min:- "+al);
        System.out.println("Power of number:- "+Math.pow(2, 5));
    }
}

// common algorithma