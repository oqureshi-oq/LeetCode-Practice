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
            if(iter.child != null){
                Node next = iter.next; 
                Node child = iter.child;
                iter.next = child;
                child.prev = iter; 
                iter.child = null; 
                while(child.next != null)
                    child = child.next; 
                child.next = next; 
                if(next != null)
                    next.prev = child; 
            }
            iter = iter.next; 
        }
        
        return head; 
    }
}