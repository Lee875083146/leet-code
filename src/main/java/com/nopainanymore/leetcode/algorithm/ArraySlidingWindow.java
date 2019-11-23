package com.nopainanymore.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author nopainanymore
 * @time 2019-07-01 23:53
 * LeetCode 239
 */
@Slf4j
public class ArraySlidingWindow {

    private static Deque<Integer> deque = new ArrayDeque<>();

    private int[] nums;

    public void cleanDeque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!deque.isEmpty() && deque.getFirst() == i - k)
            deque.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }


    private int[] solution(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (n == 1) {
            return nums;
        }
        this.nums = nums;
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            cleanDeque(i, k);
            deque.addLast(i);
            // compute max in nums[:k]
            if (nums[i] > nums[max_idx]) max_idx = i;
        }
        int[] output = new int[n - k + 1];
        output[0] = nums[max_idx];

        // build output
        for (int i = k; i < n; i++) {
            cleanDeque(i, k);
            deque.addLast(i);
            output[i - k + 1] = nums[deque.getFirst()];
        }
        return output;
    }

    public static void main(String[] args) {
        ArraySlidingWindow arraySlidingWindow = new ArraySlidingWindow();
        int a[] = {2, 3, 1, 3, 5, 6, 13, 5};
        for (int i : arraySlidingWindow.solution(a, 3)) {
            log.info("ArraySlidingWindow- main- {}", i);
        }
    }

}
