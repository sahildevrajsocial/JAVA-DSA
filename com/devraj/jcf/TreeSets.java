package com.devraj.jcf;

import java.util.*;

public class TreeSets {
    public static void main(String[] args) {
        // DS that stores unique elements in sorted order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(0);
        ts.add(-1);
        System.out.println(ts);
        System.out.println(ts.floor(5));
        System.out.println(ts.ceiling(-1));
    }
}
