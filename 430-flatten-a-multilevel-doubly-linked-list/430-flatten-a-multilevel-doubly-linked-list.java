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
        flattenHelper(head); 
        return head; 
    }
    
    public Node flattenHelper(Node node){
        if(node == null) return null; 
        
        Node iter = node; 
        
        while(iter.child != null || iter.next != null){
            Node child = iter.child;
            Node next = iter.next;
            
            if(child != null){
                iter.next = child;
                child.prev = iter; 
                iter.child = null; 
                
                Node endOfChildLink = flattenHelper(child);
                endOfChildLink.next = next; 
                if(next != null)
                    next.prev = endOfChildLink; 
            }
            
            if(next != null)
                iter = iter.next; 
        }
        
        return iter; 
    }
}