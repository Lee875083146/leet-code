package com.nopainanymore.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author nopainanymore
 * @time 2019-07-01 23:53
 * LeetCode 239
 */
public class ArraySlidingWindow {

    private final Deque<Integer> deque;

    private final int k;

    public ArraySlidingWindow(int k, int a[]) {
        this.deque = new ArrayDeque<>(k);
        this.k = k;

    }

    private void init(int k, int a[]) {
        if (k < a.length) {
            for (int i = 0; i < k; i++) {
                deque.addLast(a[i]);
            }
        }
    }

    private int slide(int a[]) {

        return 1;

    }


}
