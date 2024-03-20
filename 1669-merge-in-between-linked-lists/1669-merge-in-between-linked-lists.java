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
        ListNode prevA = null; 
        ListNode bNode = null; 
        ListNode lastOfList2 = list2;
        
        for(int i = 0; i <= b; i++){
            if(i == a-1)
                prevA = iter;
            
            iter = iter.next; 
        }
        
        bNode = iter; 
        prevA.next = list2; 
        
        lastOfList2 = list2; 
        while(lastOfList2.next != null)
            lastOfList2 = lastOfList2.next; 
        
        lastOfList2.next = bNode; 
            
        return list1; 
    }
}