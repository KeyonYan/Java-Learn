package com.keyon.algo.DeWu;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int x = cin.nextInt();
        int avg = 1;
        int rem = m % n;
        int maxHigh = avg;
        if (rem > 0) {
            int i = 1;
            rem -= i;
            int left = x-1;
            int right = n-x;
            int time = 0;
            while (rem >= 0) {
                maxHigh++;
                i += (time < left?1:0) + (time < right?1:0);
                rem -= i;
                time++;
            }
        }
        System.out.println(maxHigh);
    }
}
