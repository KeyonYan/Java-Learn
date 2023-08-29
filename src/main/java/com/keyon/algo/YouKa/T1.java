package com.keyon.algo.YouKa;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt() - 1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(1 << m));
        System.out.println((n & (1 << m)) != 0);
    }
}

