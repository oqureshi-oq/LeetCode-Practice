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
        
        ListNode iter = sentinel; 
        int length = 0; 
        
        while(iter != null){
            length++;
            iter = iter.next; 
        }
        
        iter = sentinel; 
        
        while(length != n+1){
            length--; 
            iter = iter.next; 
        }
        
        ListNode temp = iter.next;
        iter.next = iter.next.next; 
        if(temp == head)
            head = head.next; 
        
        return head; 
    }
}