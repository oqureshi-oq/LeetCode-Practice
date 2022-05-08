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
        ListNode prev = sentinel; 
        ListNode current = head;
        
        while(current != null){
            if(current.val == val){
                current = current.next; 
                prev.next = current; 
            } else {
                prev = current; 
                current = current.next; 
            }
        }
        
        return sentinel.next; 
    }
}