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
        
        ListNode firstEvenNode = head.next; 
        ListNode lastOddNode = head; 
        ListNode iter = head; 
        boolean oddNode = true; 
        
        while(iter != null){
            ListNode temp = iter.next; 
            if(iter.next != null)
                iter.next = iter.next.next; 
            if(oddNode)
                lastOddNode = iter; 
            iter = temp; 
            oddNode = !oddNode; 
        }
        
        lastOddNode.next = firstEvenNode; 
        return head; 
    }
}