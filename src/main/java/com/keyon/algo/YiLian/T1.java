package com.keyon.algo.YiLian;

import java.util.Arrays;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char[] S = cin.next().toCharArray();
        int n = S.length;
        int[] shifts = new int[n];
        int[] suffixSum = new int[n];
        for (int i = 0; i < n; i++) {
            shifts[i] = cin.nextInt();
        }
        suffixSum[n-1] = shifts[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] += shifts[i] + suffixSum[i+1];
        }
        for (int i = 0; i < n; i++) {
            int c = (int) S[i] - 'a';
            S[i] = (char) ((c + suffixSum[i]) % 'z' + 'a');
        }
        System.out.println(String.valueOf(S));
    }
}
