/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null; 
        
        ListNode fast = head; 
        ListNode slow = head; 
        ListNode meetingNode = null; 
        ListNode cycleEntryNode = null; 
        
        while(fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next; 
            
            if(fast == slow){
                meetingNode = fast; 
                cycleEntryNode = head; 
                while(cycleEntryNode != meetingNode){
                    cycleEntryNode = cycleEntryNode.next;
                    meetingNode = meetingNode.next; 
                }
                break; 
            }
        }
        
        return cycleEntryNode; 
    }
}