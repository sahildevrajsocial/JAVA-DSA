package com.devraj.recursion;
import java.util.*;

class ReverseFunc {
    public void func(int l, int r, ArrayList<Character> s) {
        if (l >= r) return;
        char temp = s.get(l);
        s.set(l, s.get(r));
        s.set(r, temp);

        func(l + 1, r - 1, s);
    }

    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        func(0, s.size() - 1, s);
        return s;
    }
}
public class ReverseAString {
    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        ReverseFunc reverse = new ReverseFunc();
        System.out.println(reverse.reverseString(s));
    }
}
