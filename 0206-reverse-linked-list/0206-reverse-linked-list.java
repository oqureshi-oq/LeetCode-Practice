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
        if(head == null)
            return null; 
        
        ListNode current = head;
        ListNode next = head.next;
        ListNode prev = null; 
        
        while(current != null){
            current.next = prev; 
            prev = current; 
            current = next; 
            if(current != null)
                next = current.next; 
        }
        
        return prev; 
    }
}