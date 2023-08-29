package com.keyon.algo.WanMei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T2 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ListNode head = init(Arrays.asList(1,3,4));
    }

    private static ListNode init(List<Integer> list) {
        ListNode head = new ListNode(list.get(0));
        ListNode cur = head;
        for (int i = 1; i < list.size(); i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }
        return head;
    }
}
