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
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        
        ListNode iter = head; 
        
        while(iter != null){
            stack.push(iter);
            iter = iter.next; 
        }
        
        iter = head; 
        
        while(iter != stack.peek() && iter.next != stack.peek()){
            ListNode next = iter.next; 
            ListNode nodeFromEnd = stack.pop(); 
            iter.next = nodeFromEnd;
            nodeFromEnd.next = next; 
            iter = next; 
        }
        
        if(iter.next == stack.peek())
            iter.next.next = null; 
        else
            iter.next = null; 
        
        //iter.next = null; 
    }
}