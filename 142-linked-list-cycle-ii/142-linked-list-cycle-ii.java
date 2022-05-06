/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode iter = head; 
        Set<ListNode> set = new HashSet(); 
        
        while(iter != null){
            if(set.contains(iter)) return iter; 
            set.add(iter);
            iter = iter.next; 
        }
        
        return null; 
    }
}