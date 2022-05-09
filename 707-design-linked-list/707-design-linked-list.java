class MyLinkedList {
    
    class Node {
        private int val; 
        private Node prev; 
        private Node next; 
        
        Node(int val){
            this.val = val; 
            this.prev = null; 
            this.next = null; 
        }   
    }
    
    private Node head; 
    private int length; 

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
            node.prev = null; 
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
        if(iter.next !=null)
            iter.next.prev = node; 
        iter.next = node; 
        node.prev = iter; 
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return; 
        
        length--; 
        
        if(index == 0){
            head = head.next; 
            if(head != null)
                head.prev = null; 
            return; 
        }
        
        Node iter = head; 
        int count = 0; 
        
        while(count != index-1){
            iter = iter.next; 
            count++; 
        }
        
        if(iter.next != null)
            iter.next = iter.next.next; 
        
        if(iter.next != null)
            iter.next.prev = iter; 
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