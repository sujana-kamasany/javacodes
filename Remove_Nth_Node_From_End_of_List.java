// problem link -> https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head, j = head;
        while(n-- > 0) j = j.next;
        
        //j = null means we have to remove first element
        if(j == null) return head.next;

        while(j.next != null){
            i = i.next;
            j = j.next;
        }
        i.next = i.next.next;
        return head;
    }
}
