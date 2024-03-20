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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode iter = list1; 
        ListNode x = null; 
        
        for(int i = 0; i <= b; i++){
            if(i == a-1)
                x = iter;
            
            iter = iter.next; 
        }
        
        x.next = list2; 
        
        ListNode y = list2; 
        while(y.next != null)
            y = y.next; 
        
        y.next = iter; 
            
        return list1; 
    }
}