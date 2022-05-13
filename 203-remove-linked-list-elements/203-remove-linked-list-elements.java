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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null; 
        
        ListNode sentinel = new ListNode(0, head); 
        ListNode iter = sentinel; 
        
        while(iter.next != null){
            if(iter.next.val == val)
                iter.next = iter.next.next; 
            else
                iter = iter.next; 
        }
        
        return sentinel.next; 
    }
}