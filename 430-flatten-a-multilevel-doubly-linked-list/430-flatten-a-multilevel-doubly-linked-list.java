/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null; 
        
        Node iter = head;
        
        while(iter != null){
            Node next = iter.next; 
            Node immediateChild = iter.child; 
            Node lastChild = getLastChild(iter.child); 
            if(lastChild != null){
                iter.next = immediateChild; 
                immediateChild.prev = iter; 
                lastChild.next = next; 
                if(next != null)
                    next.prev = lastChild; 
            }
            iter.child = null; 
            iter = next; 
        }
        
        return head; 
    }
    
    public Node getLastChild(Node child){
        if(child == null) return null; 
        
        Node iter = child; 
        
        while(iter.next != null || iter.child != null){
            Node next = iter.next; 
            Node immediateChild = iter.child; 
            Node lastChild = getLastChild(iter.child); 
            if(lastChild != null){
                iter.next = immediateChild; 
                immediateChild.prev = iter; 
                lastChild.next = next;
                if(next != null)
                    next.prev = lastChild; 
            }
            iter.child = null; 
            if(next != null)
                iter = next;
            else
                iter = lastChild; 
        }
        
        return iter; 
    }
}