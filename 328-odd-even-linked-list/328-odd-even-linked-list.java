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
        ListNode evenIter = head.next; 
        ListNode evenHead = head.next; 
        
        while(evenIter != null){
            oddIter.next = evenIter.next; 
            if(oddIter.next != null)
                evenIter.next = oddIter.next.next;
            if(oddIter.next != null)
                oddIter = oddIter.next; 
            evenIter = evenIter.next; 
        }
        
        oddIter.next = evenHead; 
        
        return head; 
    }
}