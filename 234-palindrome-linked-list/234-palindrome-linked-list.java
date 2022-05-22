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
        ListNode endIter = end; 
        ListNode start = head; 
        
        while(start != null && endIter != null){
            if(start.val != endIter.val)
                return false; 
            start = start.next; 
            endIter = endIter.next; 
        }
        
        reverse(end, null); 
        
        return true; 
    }
    
    public ListNode reverse(ListNode node, ListNode prev){
        while(node != null){
            ListNode next = node.next;
            node.next = prev; 
            prev = node; 
            node = next; 
        }
        
        return prev; 
    }
}