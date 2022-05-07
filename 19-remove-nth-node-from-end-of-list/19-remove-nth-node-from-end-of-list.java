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
        
        ListNode dummy = new ListNode(0, head); 
        int length = 0; 
        
        ListNode iter = dummy; 
        while(iter != null){
            length++; 
            iter = iter.next; 
        }
        
        iter = dummy; 
        while(length != n+1){
            iter = iter.next; 
            length--; 
        }
        
        ListNode temp = iter.next;
        iter.next = iter.next.next;
        
        if(temp == head)
            head = head.next; 
        
        return head; 
    }
}