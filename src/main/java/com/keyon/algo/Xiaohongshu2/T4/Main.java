package com.keyon.algo.Xiaohongshu2.T4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileInputStream("src/com/keyon/algo/Xiaohongshu2/T4/input.txt"));
//        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 球的个数 1 <= n <= 5000
        int[] nums = new int[n]; // 球的数字
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        char[] colors = cin.next().toCharArray(); // 球的颜色
        int m = cin.nextInt(); // 操作的个数 1 <= m <= 100000
        int[] times = new int[m]; // 操作的时间点
        for (int i = 0; i < m; i++) {
            times[i] = cin.nextInt();
        }
        // 定义两个数组，分别存放当前放入的红球和蓝球的编号
        List<Integer> red = new ArrayList<>();
        List<Integer> blue = new ArrayList<>();
        // 操作 0: 询问 正数x: 放入编号为x的球 负数x: 取出编号为x的球
        for (int i = 0; i < m; i++) {
            int op = cin.nextInt();
            if (op == 0) {
                // query
            } else if (op > 0) {
                // put
                if (colors[op - 1] == 'R') {
                    red.add(op);
                } else {
                    blue.add(op);
                }
            } else {
                // take
                if (colors[-op - 1] == 'R') {
                    red.remove((Integer) (-op));
                } else {
                    blue.remove((Integer) (-op));
                }
            }
        }
    }

    private static int query(int time) {
        return 0;
    }

}
