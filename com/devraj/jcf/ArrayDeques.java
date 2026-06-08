package com.devraj.jcf;

import java.util.*;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(6);
        ad.offer(9);
        ad.offer(10);
        System.out.println(ad);
        System.out.println(ad.size());
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad);
    }
}
