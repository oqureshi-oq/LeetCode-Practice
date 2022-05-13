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
        
        ListNode end = reverse(slow, null);
        ListNode start = head;
        
        while(start != null && end != null){
            if(start.val != end.val) return false;
            start = start.next; 
            end = end.next; 
        }
        
        return true; 
    }
    
    public ListNode reverse(ListNode current, ListNode prev){
        if(current == null) return prev;
        
        while(current != null){
            ListNode next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        
        return prev; 
    }
}