class MyLinkedList {
    
    class Node {
        private int val; 
        private Node next; 
        
        Node(int val){
            this.val = val; 
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
        
        int i = 0; 
        Node iter = head; 
        
        while(i != index){
            iter = iter.next; 
            i++; 
        }
        
        return iter.val; 
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val); 
        node.next = head; 
        head = node; 
        length++; 
    }
    
    public void addAtTail(int val) {
        if(length == 0){
            addAtHead(val);
            return; 
        }
        
        Node iter = head; 
        while(iter.next != null)
            iter = iter.next;
        
        Node node = new Node(val);
        iter.next = node; 
        length++; 
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;
        
        if(index == 0){
            addAtHead(val);
            return; 
        }
        
        if(index == length){
            addAtTail(val);
            return;
        }
        
        Node iter = head; 
        int i = 0; 
        
        while(i != index-1){
            iter = iter.next; 
            i++; 
        }
        
        Node node = new Node(val);
        node.next = iter.next;
        iter.next = node; 
        length++; 
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;
        
        if(index == 0){
            head = head.next;
            length--;
            return; 
        }
        
        Node iter = head; 
        int i = 0;
        
        while(i != index-1){
            iter = iter.next; 
            i++; 
        }
        
        iter.next = iter.next.next; 
        length--; 
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