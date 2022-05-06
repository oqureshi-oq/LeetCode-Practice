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
        
        ListNode iterA = headA; 
        ListNode iterB = headB; 
        
        while(iterA != iterB){
            iterA = iterA == null ? headB: iterA.next; 
            iterB = iterB == null ? headA: iterB.next; 
        }
        
        return iterA; 
    }
}