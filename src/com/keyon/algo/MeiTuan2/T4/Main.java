package com.keyon.algo.MeiTuan2.T4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] kvStr = cin.next().split(";");
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < kvStr.length; i++) {
            String[] kv = kvStr[i].split("=");
            map.put(kv[0], kv[1]);
        }
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            String query = cin.next();
            if (map.containsKey(query)) {
                System.out.println(map.get(query));
            } else {
                System.out.println("EMPTY");
            }
        }
    }
}
