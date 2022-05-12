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
        
        int length = 0; 
        ListNode iter = head; 
        while(iter != null){
            length++; 
            iter = iter.next; 
        }
        
        int sum = 0; 
        iter = head; 
        
        while(iter != null){
            sum += iter.val * (int) Math.pow(2, length-1); 
            iter = iter.next; 
            length--; 
        }
        
        return sum; 
    }
}