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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        
        ListNode fast = head; 
        ListNode slow = head; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next; 
        }
        
        ListNode end = reverse(slow);
        ListNode iter = head; 
        
        while(iter != null && end != null){
            ListNode nextStart = iter.next;
            ListNode nextEnd = end.next; 
            iter.next = end;
            end.next = nextStart; 
            iter = nextStart;
            end = nextEnd; 
        }
        
        if(iter != null)
            iter.next = null; 
    }
    
    public ListNode reverse(ListNode node){
        if(node == null)
            return null; 
        
        ListNode current = node;
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