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
    public int getDecimalValue(ListNode head) {
        if(head == null) return -1; 
        
        ListNode iter = head; 
        int sum = 0; 
        
        while(iter != null){
            sum *= 2; 
            sum += iter.val; 
            iter = iter.next; 
        }
        
        return sum; 
    }
}