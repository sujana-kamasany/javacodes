// problem link -> https://leetcode.com/problems/reverse-nodes-in-k-group/

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
    public ListNode reverseKGroup(ListNode head, int k) {
        MyLinkedList given = new MyLinkedList();
        MyLinkedList prev = null;
        while(head != null){
            given.addLast(head.val);
            head = head.next;
        }
        while(given.size > 0){
            MyLinkedList curr = new MyLinkedList();
            if(given.size >= k){
                for(int i = 0; i < k; i++){
                    curr.addFirst(given.getFirst());
                    given.removeFirst();
                }
            } else {
                int os = given.size;
                for(int i = 0; i < os; i++){
                    curr.addLast(given.getFirst());
                    given.removeFirst();
                }
            }
            if(prev == null){
                prev = curr;
            } else {
                prev.tail.next = curr.head;
                prev.tail = curr.tail;
                prev.size += curr.size;
            }
        }
        return prev.head;
    }
}
class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        if(size == 0){
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int val) {
        ListNode node = new ListNode(val);
        if(size == 0) {
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = tail.next;
        size++;
    }

    public void removeFirst() {
        if(size != 0){
            head = head.next;
            size--;
        }
    }

    public int getFirst() {
        if(size == 0){
            return -1;
        } 
        return head.val;
    }
}
