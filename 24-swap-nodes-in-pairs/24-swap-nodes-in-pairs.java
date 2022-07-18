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
    public ListNode swapPairs(ListNode head) {
        ListNode sentinel = new ListNode(0, head);
        ListNode prev = sentinel; 
        ListNode iter = head; 
        
        while(iter != null && iter.next != null){
            ListNode next = iter.next; 
            prev.next = next;
            iter.next = next.next; 
            next.next = iter;  
            prev = iter; 
            iter = iter.next; 
        }
        
        return sentinel.next; 
    }
}