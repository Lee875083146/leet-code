package com.nopainanymore.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leet-code: ThreeSum
 *
 * @author NoPainAnymore
 * @date 2019-07-06 19:31
 * LeetCode 15
 */
@Slf4j
public class ThreeSum {


    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int cur, left, right;
        for (int i = 0; i < nums.length - 2; i++) {
            cur = nums[i];
            if (cur > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (0 < cur + nums[left] + nums[right]) {
                    right--;
                } else if (0 > cur + nums[left] + nums[right]) {
                    left++;
                } else {
                    log.info("ThreeSum- threeSum- {},{},{}", cur, nums[left], nums[right]);
                    List<Integer> solution = new ArrayList<>();
                    solution.add(nums[i]);
                    solution.add(nums[left]);
                    solution.add(nums[right]);
                    result.add(solution);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        int[] b = {0, 0, 0, 0};
        threeSum(a);
        threeSum(b);
    }


}
