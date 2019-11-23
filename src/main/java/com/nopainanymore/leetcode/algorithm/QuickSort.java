package com.nopainanymore.leetcode.algorithm;

/**
 * leet-code: QuickSort
 *
 * @author NoPainAnymore
 * @date 2019-07-06 19:35
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 6, 7, 2, 8, 12, 46};
        quickSort(arr, 0, arr.length - 1);
        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || left > right || arr.length <= 1) {
            return;
        }
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid - 1);
        quickSort(arr, mid + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (left < right) {
            while (left < right && temp <= arr[right]) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }
            while (left < right && temp >= arr[left]) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = temp;
        return left;
    }

}
