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
        
        while(iter != null){
            Node node = iter.next; 
            if(iter.random != null)
                node.random = iter.random.next; 
            else
                node.random = null; 
            iter = node.next; 
        }
        
        iter = head; 
        Node newHead = head.next; 
        
        while(iter.next != null){
            Node next = iter.next;
            iter.next = iter.next.next; 
            iter = next; 
        }
        
        return newHead; 
    }
}