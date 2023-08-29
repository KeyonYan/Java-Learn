package com.keyon.algo.WanMei;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.next();
        String b = cin.next();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = digitA + digitB + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            res.append(sum);
            i--;
            j--;
        }
        if (carry == 1) {
            res.append(1);
        }
        System.out.println(res.reverse());
    }
}
