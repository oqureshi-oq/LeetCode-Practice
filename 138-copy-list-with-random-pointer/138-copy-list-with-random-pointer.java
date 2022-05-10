/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null; 
        
        Node iter = head; 
        
        while(iter != null){
            Node node = new Node(iter.val); 
            node.next = iter.next; 
            iter.next = node; 
            iter = node.next; 
        }
        
        iter = head; 
        Node newHead = head.next; 
        
        while(iter != null){
            Node copy = iter.next; 
            copy.random = iter.random; 
            if(copy.random != null){
                copy.random = copy.random.next;  
            }
            iter = iter.next.next; 
        }
        
        iter = head; 
        while(iter != null){
            Node next = iter.next; 
            iter.next = next.next; 
            if(next.next != null)
                next.next = next.next.next; 
            iter = iter.next; 
        }
     
        return newHead; 
    }
}