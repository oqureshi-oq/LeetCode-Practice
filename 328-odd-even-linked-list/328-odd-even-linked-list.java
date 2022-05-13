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
        
        ListNode oddTail = head; 
        ListNode evenHead = head.next; 
        
        ListNode iter = head; 
        boolean atOddIndex = true; 
        
        while(iter != null){
            ListNode next = iter.next;
            if(iter.next != null)
                iter.next = iter.next.next; 
            if(atOddIndex)
                oddTail = iter; 
            atOddIndex = !atOddIndex; 
            iter = next; 
        }
        
        oddTail.next = evenHead; 
        
        return head; 
    }
}