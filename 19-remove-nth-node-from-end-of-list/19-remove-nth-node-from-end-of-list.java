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
        
        ListNode sentinel = new ListNode(0, head);
        int length = getLength(sentinel);  
        ListNode iter = sentinel; 
        
        while(length != n+1){
            iter = iter.next; 
            length--; 
        }
        
        iter.next = iter.next.next; 
        
        return sentinel.next; 
    }
    
    public int getLength(ListNode node){
        int length = 0; 
        while(node != null){
            length++; 
            node = node.next; 
        }
        return length; 
    }
}