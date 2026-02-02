package com.springboot.collections.advancelevel.list.linkedlist;

/**
 * @author prabhakar, @Date 02-02-2026
 */

// ListNode definition
class ListNode {
    int val;
    ListNode next;
    ListNode(int v){ val = v; }
}

// Reverse a singly linked list in-place.
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

