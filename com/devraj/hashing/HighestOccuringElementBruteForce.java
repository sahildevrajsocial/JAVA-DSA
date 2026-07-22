package com.devraj.hashing;

import java.util.*;

public class HighestOccuringElementBruteForce {

    public static int func(int[] arr, int size) {
        int[] vis = new int[100001];
        int maxCount = 0, el = -1;

        for(int i = 0; i < size; i++) {
            int count = 0;
            if(vis[arr[i]] == 0) {
                vis[arr[i]] = 1;
                for (int j = 0; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    el = arr[i];
                } else if (count == maxCount && arr[i] < el) {
                    el = arr[i];
                }
            }
        }
        return el;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:- ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = func(arr, size);
        System.out.println("Most frequent element: " + ans);
    }
}
