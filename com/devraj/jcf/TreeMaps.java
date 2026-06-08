package com.devraj.jcf;

import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "Devraj");
        mp.put(2, "Raj");
        mp.put(3, "Rima");
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println(mp.remove(2));
        System.out.println(mp);
    }
}
