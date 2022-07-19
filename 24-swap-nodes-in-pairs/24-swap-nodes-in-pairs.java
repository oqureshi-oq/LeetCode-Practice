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
        ListNode current = head; 
        
        while(current != null && current.next != null){
            ListNode next = current.next; 
            current.next = next.next; 
            next.next = current; 
            prev.next = next; 
            prev = current; 
            current = current.next; 
        }
        
        return sentinel.next; 
    }
}