/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null; 
        
        createCycle(headA); 
        
        ListNode fast = headB;
        ListNode slow = headB; 
        ListNode intersection = null; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next; 
            
            if(fast == slow){
                intersection = headB; 
                while(intersection != slow){
                    intersection = intersection.next; 
                    slow = slow.next; 
                }
                break; 
            }
        }
        
        deleteCycle(headA);
        
        return intersection; 
    }
    
    public void createCycle(ListNode head){
        if(head == null) return;
        
        ListNode iter = head; 
        while(iter.next != null)
            iter = iter.next; 
        iter.next = head; 
    }
    
    public void deleteCycle(ListNode head){
        if(head == null) return; 
        
        ListNode iter = head; 
        while(iter != null && iter.next != head)
            iter = iter.next; 
        iter.next = null; 
    }
}