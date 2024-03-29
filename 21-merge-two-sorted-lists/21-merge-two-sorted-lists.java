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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        
        ListNode sentinel = new ListNode();
        ListNode iter = sentinel; 
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                iter.next = list1;
                list1 = list1.next;
            } else {
                iter.next = list2; 
                list2 = list2.next; 
            }
            
            iter = iter.next; 
        }
        
        if(list2 != null)
            iter.next = list2;
        else
            iter.next = list1; 
        
        return sentinel.next; 
    }
}