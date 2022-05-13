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
        flattenHelper(head); 
        return head; 
    }
    
    public Node flattenHelper(Node node){
        if(node == null) return node; 
        
        Node iter = node; 
        
        while(iter.child != null || iter.next != null){
            Node next = iter.next; 
            
            if(iter.child != null){
                Node child = iter.child;
                iter.next = child; 
                child.prev = iter; 
                iter.child = null; 
                Node end = flattenHelper(child); 
                if(next == null) return end; 
                end.next = next;
                next.prev = end; 
            }
            
            iter = next; 
        }
        
        return iter; 
    }
}