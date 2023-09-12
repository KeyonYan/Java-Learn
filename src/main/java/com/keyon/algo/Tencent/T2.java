package com.keyon.algo.Tencent;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {
            int n = cin.nextInt();
            List<List<Integer>> a = new ArrayList<>(n);
            List<Integer> b = new ArrayList<>(n-1);
            for (int i = 0; i < n; i++) {
                List<Integer> v = new ArrayList<>(2);
                v.add(cin.nextInt());
                v.add(i);
                a.add(v);
            }
            for (int i = 0; i < n-1; i++) {
                b.add(cin.nextInt());
            }
            a.sort((List<Integer> x, List<Integer> y) -> x.get(0) - y.get(0));
            float mid;
            if (n % 2 == 0) {
                mid = (a.get((n/2)-1).get(0) + a.get(n/2).get(0)) / 2.0f;
            } else {
                mid = a.get((n-1)/2).get(0);
            }
            System.out.print(mid + " ");
            for (int i : b) {
                int delete_i = 0;
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(j).get(1) == i-1) {
                        delete_i = j;
                        break;
                    }
                }
                a.remove(delete_i);
                int new_n = a.size();
                if (new_n % 2 == 0) {
                    mid = (a.get((new_n/2)-1).get(0) + a.get(new_n/2).get(0)) / 2.0f;
                } else {
                    mid = a.get((new_n-1)/2).get(0);
                }
                System.out.print(mid + " ");
            }
            System.out.println();
        }
    }
}
