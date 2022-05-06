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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false; 
        
        Set<ListNode> set = new HashSet(); 
        ListNode iter = head; 
        
        while(iter != null){
            if(set.contains(iter)) 
                return true;
            
            set.add(iter);
            iter = iter.next; 
        }
        
        return false;
    }
}