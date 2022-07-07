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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false; 
        
        ListNode fast = head; 
        ListNode slow = head; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next; 
        }
        
        ListNode head2 = reverse(slow);
        
        ListNode iter1 = head; 
        ListNode iter2 = head2;
        
        while(iter1 != null && iter2 != null){
            if(iter1.val != iter2.val)
                return false; 
            
            iter1 = iter1.next;
            iter2 = iter2.next; 
        }
        
        return true; 
    }
    
    public ListNode reverse(ListNode head){
        if(head == null) return null; 
        
        ListNode current = head; 
        ListNode prev = null; 
        
        while(current != null){
            ListNode next = current.next;
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        
        return prev; 
    }
}