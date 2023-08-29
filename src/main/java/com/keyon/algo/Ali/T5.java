package com.keyon.algo.Ali;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int q = cin.nextInt();
        for (int k = 0; k < q; k++) {
            char[] a = cin.next().toCharArray();
            char[] b = cin.next().toCharArray();
            int p1 = 0, p2 = 0;
            while (p1 < a.length && p2 < b.length) {
                if (a[p1] == b[p2] || Character.toUpperCase(a[p1]) == b[p2]) {
                    p1++;
                    p2++;
                } else {
                    if (Character.isUpperCase(a[p1])) {
                        p2 = 0;
                    }
                    p1++;
                }
            }
            if (p2 == b.length) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
