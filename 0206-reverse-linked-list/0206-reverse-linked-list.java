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
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }
    
    public ListNode reverseList(ListNode current, ListNode prev){
        if(current == null)
            return prev; 
        
        ListNode next = current.next; 
        current.next = prev; 
        return reverseList(next, current); 
    }
    
//     public ListNode reverseList(ListNode head) {
//         if(head == null)
//             return null; 
        
//         ListNode current = head;
//         ListNode next = head.next;
//         ListNode prev = null; 
        
//         while(current != null){
//             current.next = prev; 
//             prev = current; 
//             current = next; 
//             if(current != null)
//                 next = current.next; 
//         }
        
//         return prev; 
//     }
}