// Q61. Rotate List

// Runtime 0 ms Beats 100.00%
// Memory 44.4 MB Beats 25.10%

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) return head;
        // find tail
        ListNode tail = head.next;
        int count = 2;
        while(tail.next != null){
            count ++;
            tail = tail.next;
        }

        // connect head to tail
        tail.next = head;
        ListNode prev= tail;
        k = count -(k%count)+1;
        //find k th
        for(int i = 0 ; i<k;i++){
            prev = tail;
            tail = tail.next;
        }

        prev.next = null;

        return tail;
    }
}
