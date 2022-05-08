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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null; 
        
        ListNode prev = null; 
        ListNode iter = head; 
        ListNode next = null; 
        
        while(iter != null){
            next = iter.next; 
            iter.next = prev; 
            prev = iter; 
            iter = next; 
            head = prev; 
        }
        
        return head; 
    }
}