package com.devraj.jcf;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> al =  new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);

        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
}
