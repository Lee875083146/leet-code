package com.nopainanymore.leetcode.algorithm;

import java.util.HashMap;

/**
 * leet-code: TwoSum
 *
 * @author NoPainAnymore
 * @date 2019-07-03 23:35
 * LeetCode 1
 */
public class TwoSum {

    private static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 51, 3};
        for (int i : solution(a, 4)) {
            System.out.println(i);
        }
    }

}

