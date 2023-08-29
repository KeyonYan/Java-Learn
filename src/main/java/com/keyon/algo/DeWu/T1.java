package com.keyon.algo.DeWu;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int x = cin.nextInt();
        char[] str = cin.next().toCharArray();
        int p = 0;
        int q = x-1;
        while (q < n) {
            if (judge(str, p, q)) {
                System.out.println(1);
                return;
            }
            p++;
            q++;
        }
        System.out.println(0);
    }
    private static boolean judge(char[] str, int p, int q) {
        for (int i = p; i < q/2; i++) {
            if (str[i] != str[q-i-1]) {
                return false;
            }
        }
        return true;
    }
}
