package com.keyon.algo.LeetCodeDWeak106.T1;

public class Main {
    public static boolean isFascinating(int n) {
        int n2 = n * 2;
        int n3 = n * 3;
        System.out.println(n2);
        System.out.println(n3);
        if (getDigitSum(n) + getDigitSum(n2) + getDigitSum(n3) == 45) return true;
        return false;
    }
    private static int getDigitSum(int v) {
        int sum = 0;
        while (v > 0) {
            sum = sum + v % 10;
            v /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isFascinating(129));
    }
}
