package com.keyon.DeWu2;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            int L = cin.nextInt();
            int R = cin.nextInt();
            int m = cin.nextInt();
            System.out.println(count(L, R, m));
        }
    }

    private static int count(int L, int R, int m) {
        if (m <= 2*L) return 0;
        if (m >= 2*R) return 0;
        return (m-2*L+1)/2;
    }

    private static int count2(int L, int R, int m) {
        if (m <= 2*L) return 0;
        if (m >= 2*R) return 0;
        return (m-2*L+1)/2;
    }


}
