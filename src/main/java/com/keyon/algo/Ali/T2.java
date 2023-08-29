package com.keyon.algo.Ali;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int[] ids = new int[k];
        for (int i = 0; i < n; i++) {
            int id = (int) cin.nextLong() % k;
            ids[id]++;
        }
        long res = 0;
        for (int i = 0; i <= k / 2; i++) {
            if (i == 0) {
                res += combination(ids[i], 2);
            } else {
                long v = (long) ids[i] * ids[k - i];
                res += v;
            }
        }
        System.out.println(res);
    }
    private static long combination(int n, int k) {
        int a=1,b=1;
        if(k>n/2) {
            k=n-k;
        }
        for(int i=1;i<=k;i++) {
            a*=(n+1-i);
            b*=i;
        }
        return a/b;
    }

}
