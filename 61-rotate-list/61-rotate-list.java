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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null; 
        
        int length = getLength(head); 
        k %= length; 
        
        ListNode fast = head; 
        ListNode slow = head; 
        
        for(int i = 0; i < k; i++){
            fast = fast.next; 
        }
        
        while(fast.next != null){
            fast = fast.next; 
            slow = slow.next; 
        }
        
        fast.next = head; 
        head = slow.next; 
        slow.next = null; 
        
        return head; 
    }
    
    public int getLength(ListNode head){
        ListNode iter = head; 
        int length = 0; 
        while(iter != null){
            length++; 
            iter = iter.next; 
        }
        return length; 
    }
}