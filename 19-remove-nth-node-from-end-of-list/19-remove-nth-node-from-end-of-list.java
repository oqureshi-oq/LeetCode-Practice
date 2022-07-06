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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null; 
        
        ListNode sentinel = new ListNode(-1, head); 
        ListNode fast = sentinel; 
        ListNode slow = sentinel; 
        
        for(int i = 0; i < n; i++){
            fast = fast.next; 
        }
        
        while(fast.next != null){
            fast = fast.next; 
            slow = slow.next; 
        }
        
        slow.next = slow.next.next; 
        
        return sentinel.next; 
    }
}