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
        if(list1 == null && list2 == null) return null; 
        if(list1 == null) return list2; 
        if(list2 == null) return list1; 
        
        ListNode head = null;
        ListNode iter = null; 
    
        while(list1 != null && list2 != null){
            if(head == null && list1.val <= list2.val){
                head = list1; 
                list1 = list1.next; 
                iter = head; 
                continue; 
            }
            
            if(head == null && list1.val > list2.val){
                head = list2; 
                list2 = list2.next; 
                iter = head; 
                continue;
            }
            
            if(list1.val < list2.val){
                iter.next = list1; 
                list1 = list1.next; 
            } else {
                iter.next = list2; 
                list2 = list2.next;
            }
            
            iter = iter.next; 
        }
        
        while(list1 != null){
            iter.next = list1; 
            iter = iter.next; 
            list1 = list1.next; 
        }
        
        while(list2 != null){
            iter.next = list2;
            iter = iter.next; 
            list2 = list2.next; 
        }
        
        
        return head; 
    }
}