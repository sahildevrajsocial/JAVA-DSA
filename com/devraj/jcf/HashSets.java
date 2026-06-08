package com.devraj.jcf;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        // DS that stores unique elements in a random order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(01);
        hs.add(2);
        hs.add(1);
        hs.add(0);
        hs.remove(2);
        for(var num: hs) {
            System.out.print(num+" ");
        }
    }
}
