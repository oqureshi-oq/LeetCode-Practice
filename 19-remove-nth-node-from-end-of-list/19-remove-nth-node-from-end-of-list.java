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
        int length = getLength(head); 
        
        if(length == n){
            head = head.next; 
            return head; 
        }
        
        ListNode iter = head; 
        int count = length;
        
        while(count != n+1){
            iter = iter.next;
            count--; 
        }
        
        iter.next = iter.next.next; 
        return head; 
    }
    
    public int getLength(ListNode head){
        if(head == null) return 0; 
        
        int count = 0; 
        ListNode iter = head; 
        
        while(iter != null){
            count++; 
            iter = iter.next;
        }
        
        return count; 
    }
}