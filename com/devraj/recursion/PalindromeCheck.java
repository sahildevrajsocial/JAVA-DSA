package com.devraj.recursion;
import java.util.*;

class PalindromeFunc{
    private boolean func(int l, int r, String s) {
        if(l >= r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return func(l+1, r-1, s);
    }
    public boolean palindromeCheck(String s) {
        return func(0, s.length()-1, s);
    }
}
public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        PalindromeFunc func = new PalindromeFunc();
        System.out.print(func.palindromeCheck(s));
    }
}

