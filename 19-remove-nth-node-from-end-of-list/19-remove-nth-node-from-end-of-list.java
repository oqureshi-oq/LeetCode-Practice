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
         
        ListNode slow = new ListNode(0, head);
        ListNode fast = head;
        
        for(int i = 0; i < n; i++){
            fast = fast.next; 
        }
        
        while(fast != null){
            fast = fast.next; 
            slow = slow.next; 
        }
        
        ListNode temp = slow.next; 
        slow.next = slow.next.next;
        if(temp == head)
            head = head.next;
        return head; 
    }
}