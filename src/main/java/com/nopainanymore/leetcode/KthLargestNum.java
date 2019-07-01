package com.nopainanymore.leetcode;

import java.util.PriorityQueue;

/**
 * @author nopainanymore
 * @time 2019-07-01 23:18
 */
public class KthLargestNum {

    private final PriorityQueue<Integer> priorityQueue;

    private final int k;

    private KthLargestNum(int k, int a[]) {
        this.priorityQueue = new PriorityQueue<>(k);
        this.k = k;
        for (int i : a) {
            add(i);
        }
    }

    private void add(int num) {
        if (priorityQueue.size() < k) {
            priorityQueue.offer(num);
        } else {
            if (priorityQueue.peek() < num) {
                priorityQueue.poll();
                priorityQueue.offer(num);
            }
        }
    }

    private Integer kthLargestNum() {
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 6, 8, 11, 33, 55, 66, 734, 7889, 1112};
        KthLargestNum kthLargestNum = new KthLargestNum(3, a);
        System.out.println(kthLargestNum.kthLargestNum());
    }

}
