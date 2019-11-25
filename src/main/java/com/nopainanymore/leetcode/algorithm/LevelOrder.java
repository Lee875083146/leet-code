package com.nopainanymore.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * leet-code: LevelOrder
 *
 * @author nopainanymore
 * @version 2019-11-25 11:20
 */
public class LevelOrder {

    class TreeNode {

        private String value;

        private TreeNode left;

        private TreeNode right;


    }

    public List<TreeNode> leverOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<TreeNode> result = new ArrayList();
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
            result.add(cur);
        }
        return result;
    }


}
