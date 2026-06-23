package com.devraj.strings;

import java.util.*;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)) return ans.toString();
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flowers", "fly", "flight", "flow"};
        System.out.println(longestCommonPrefix(str));
    }
}


//1. Make a stringbuilder which stores the string value.
//2. sort the array string(str).
//3. set first string as the first index of str.
//4. set the last string as the last index of str.
//5. make a loop, run till min of first and last, if first character is not equal to last index, return ans immediately.
//6. append first letter to ans.
//7. return ans