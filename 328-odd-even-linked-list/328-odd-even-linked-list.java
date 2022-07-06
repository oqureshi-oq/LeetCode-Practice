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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null; 
        
        ListNode oddIter = head; 
        ListNode evenHead = head.next; 
        ListNode evenIter = evenHead;
        
        while(evenIter != null && evenIter.next != null){
            oddIter.next = oddIter.next.next; 
            evenIter.next = evenIter.next.next; 
            
            oddIter = oddIter.next; 
            evenIter = evenIter.next; 
        }
        
        oddIter.next = evenHead; 
        
        return head; 
    }
}