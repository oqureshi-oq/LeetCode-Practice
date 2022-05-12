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
        
        if(lengthA > lengthB){
            while(lengthA != lengthB){
                iterA = iterA.next; 
                lengthA--; 
            }
        }
        
        if(lengthB > lengthA){
            while(lengthB != lengthA){
                iterB = iterB.next;
                lengthB--; 
            }
        }
        
        while(iterA != null && iterB != null){
            if(iterA == iterB) return iterA; 
            
            iterA = iterA.next; 
            iterB = iterB.next;
        }
        
        return null; 
    }
    
    public int getLength(ListNode node){
        int length = 0; 
        
        while(node != null){
            length++; 
            node = node.next; 
        }
        
        return length; 
    }
}