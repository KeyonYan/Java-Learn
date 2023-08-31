package com.keyon.algo.JiBiTe;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        List<Integer> score = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int v = cin.nextInt();
            if (score.size() == 0) {
                score.add(v);
                continue;
            }
            if (v >= 0 && score.get(score.size()-1) >= 0) {
                int peek = score.get(score.size()-1);
                score.set(score.size()-1, peek + v);
            } else {
                score.add(v);
            }
        }
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                score1 += score.get(i);
            } else {
                score2 += score.get(i);
            }
        }
        int maxScore = Math.max(score1-score2, score2-score1);
        System.out.println(maxScore);
    }
}
