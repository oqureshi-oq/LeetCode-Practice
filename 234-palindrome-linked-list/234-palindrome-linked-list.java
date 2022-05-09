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
        
        ListNode slow = head; 
        ListNode fast = head; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next; 
        }
        
        ListNode secondHead = reverse(slow, null);
        ListNode iter = head; 
        while(iter != null && secondHead != null){
            if(iter.val != secondHead.val) 
                return false;
            iter = iter.next; 
            secondHead = secondHead.next; 
        }
        
        return true; 
    }
    
    public ListNode reverse(ListNode node, ListNode prev){
        if(node == null) return null; 
        
        while(node != null){
            ListNode temp = node.next;
            node.next = prev; 
            prev = node; 
            node = temp; 
        }
        
        return prev; 
    }
}