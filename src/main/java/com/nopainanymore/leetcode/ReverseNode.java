package com.nopainanymore.leetcode;

/**
 * @author nopainanymore
 * @time 2019-07-01 23:31
 */
public class ReverseNode {

    static class Node {

        Integer value;

        Node next;

        private Node(Integer value) {
            this.value = value;
        }
    }

    private static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        Node curHead = reverse(a);
        while (curHead != null) {
            System.out.println(curHead.value);
            curHead = curHead.next;
        }
    }


}
