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
            Node addedNode = iter.next;
            addedNode.random = null; 
            if(iter.random != null)
                addedNode.random = iter.random.next; 
            iter = addedNode.next; 
        }
        
        iter = head;
        Node newHead = iter.next; 
        
        while(iter != null){
            Node addedNode = iter.next;
            iter.next = iter.next.next; 
            if(addedNode.next != null)
                addedNode.next = addedNode.next.next; 
            iter = iter.next; 
        }
        
        return newHead; 
    }
}