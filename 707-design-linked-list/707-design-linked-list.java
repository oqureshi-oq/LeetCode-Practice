class MyLinkedList {
    
    class Node {
        private int val; 
        private Node next; 
        
        Node(int val){
            this.val = val; 
            this.next = null; 
        }
        
        Node(int val, Node next){
            this.val = val; 
            this.next = next; 
        }
    }
    
    Node head; 
    int length; 

    public MyLinkedList() {
        head = null; 
        length = 0; 
    }
    
    public int get(int index) {
        if(index < 0 || index >= length) return -1; 
        
        Node iter = head; 
        int count = 0; 
        
        while(count != index){
            iter = iter.next; 
            count++; 
        }
        
        return iter.val; 
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(length, val); 
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;
        
        Node node = new Node(val); 
        length++; 
        
        if(index == 0){
            node.next = head; 
            head = node; 
            return;
        }
        
        Node iter = head;
        int count = 0; 
        
        while(count != index-1){
            iter = iter.next; 
            count++; 
        }
        
        node.next = iter.next; 
        iter.next = node; 
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;
        
        length--; 
        
        if(index == 0){
            head = head.next; 
            return; 
        }
        
        Node iter = head; 
        int count = 0;
        
        while(count != index-1){
            iter = iter.next; 
            count++; 
        }
        
        iter.next = iter.next.next; 
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */