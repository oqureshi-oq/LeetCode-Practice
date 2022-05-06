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
        int lengthA = getLength(headA);
        int lengthB = getLength(headB); 
        ListNode iterA = headA; 
        ListNode iterB = headB; 
        
        while(lengthA != lengthB){
            if(lengthA > lengthB){
                iterA = iterA.next; 
                lengthA--; 
            } else {
                iterB = iterB.next;
                lengthB--; 
            }
        }
        
        while(iterA != iterB){
            iterA = iterA.next;
            iterB = iterB.next; 
        }
        
        return iterA; 
    }
    
    public int getLength(ListNode head){
        int length = 0;  
        ListNode iter = head; 
        while(iter != null){
            length++; 
            iter = iter.next; 
        }
        
        return length; 
    }
}