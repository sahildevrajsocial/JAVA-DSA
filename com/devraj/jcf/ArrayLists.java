package com.devraj.jcf;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(7);
        al.add(9);
        al.add(8);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(3));
        System.out.println(al.remove(2));
        System.out.println(al);
        al.add(2, 181807);
        System.out.println(al);
        System.out.println(al.contains(7));
    }
}
