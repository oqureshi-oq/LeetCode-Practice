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
        if(head == null) return null; 
        
        ListNode sentinel = new ListNode(-1, head); 
        ListNode end = head; 
        ListNode prev = sentinel; 
        
        for(int i = 0; i < n; i++){
            end = end.next; 
        }
        
        while(end != null){
            end = end.next;
            prev = prev.next; 
        }
        
        ListNode deletedNode = prev.next; 
        prev.next = prev.next.next; 
        
        if(deletedNode == head)
            head = prev.next; 
        
        return head; 
    }
}