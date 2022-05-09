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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null; 
        if(l1 == null) return l2; 
        if(l2 == null) return l1;
        
        ListNode head = null; 
        ListNode iter = null; 
        
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int sum = carry; 
            
            if(l1 != null){
                sum += l1.val; 
                l1 = l1.next; 
            }
            
            if(l2 != null){
                sum += l2.val; 
                l2 = l2.next;
            }
            
            ListNode node = new ListNode(sum % 10, null);
            if(head == null){
                head = node;
                iter = node;
            }
            
            iter.next = node;
            iter = node; 
            carry = sum / 10; 
        }
        
        if(carry == 1){
            iter.next = new ListNode(1, null);
        } else{
            iter.next = null; 
        }
        
        return head; 
    }
}