package com.keyon.algo.JuRenWangLuo;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {
    static int[] seats;
    static int m, n;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        m = cin.nextInt(); // 车站数
        n = cin.nextInt(); // 座位数
        int q = cin.nextInt(); // 询问次数
        seats = new int[m]; // 每个站点当前座位数
        Arrays.fill(seats, n);
        while (q-- > 0) {
            String op = cin.next();
            if (op.equals("Q")) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                System.out.println(query(a, b));
            } else if (op.equals("B")) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                int c = cin.nextInt();
                System.out.println(buy(a, b, c));
            } else if (op.equals("R")) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                int c = cin.nextInt();
                System.out.println(refund(a, b, c));
            }
//            System.out.println(Arrays.toString(seats));
        }
    }
    private static int query(int a, int b) {
        if (!inRange(a, b)) return 0;
        int remain = Integer.MAX_VALUE;
        for (int i = a; i < b; i++) {
            remain = Math.min(remain, seats[i]);
        }
        return remain;
    }
    private static String buy(int a, int b, int ticketNum) {
        if (!inRange(a, b)) return "Fail!";
        for (int i = a; i < b; i++) {
            if (seats[i] - ticketNum < 0) return "Fail!";
        }
        for (int i = a; i < b; i++) {
            seats[i] -= ticketNum;
        }
        return "OK!";
    }
    private static String refund(int a, int b, int ticketNum) {
        if (!inRange(a, b)) return "Fail!";
        for (int i = a; i < b; i++) {
            if (seats[i] + ticketNum > n) return "Fail!";
        }
        for (int i = a; i < b; i++) {
            seats[i] += ticketNum;
        }
        return "OK!";
    }
    private static boolean inRange(int a, int b) {
        if (a > b) return false;
        if (a < 0 || a >= m) return false;
        if (b < 0 || b >= m) return false;
        return true;
    }
}
