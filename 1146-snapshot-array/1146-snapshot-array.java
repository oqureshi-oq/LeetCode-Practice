class SnapshotArray {
    
    private Map<Integer, Integer>[] arr; 
    private int snap_id; 

    public SnapshotArray(int length) {
        arr = new Map[length]; 
        snap_id = 0; 
    }
    
    public void set(int index, int val) {
        if(index < 0 || index >= arr.length) return; 
        
        if(arr[index] == null){
            arr[index] = new HashMap();
            arr[index].put(0, 0); 
        }
        
        arr[index].put(snap_id, val); 
    }
    
    public int snap() {
        return snap_id++; 
    }
    
    public int get(int index, int snap_id) {
        if(index < 0 || index >= arr.length) return -1; 
        
        if(arr[index] == null){
            arr[index] = new HashMap(); 
            arr[index].put(0, 0); 
        }
        
        if(arr[index].containsKey(snap_id))
            return arr[index].get(snap_id); 
        
        int left = 0;
        int right = snap_id; 
        int mid = left + (right-left)/2;
        
        for(int i = snap_id; i >= 0; i--){
            if(arr[index].containsKey(i))
                return arr[index].get(i); 
        }
        
        return arr[index].get(0); 
    }
}

//[0, 1, 3, 6, 8]

//<=5

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */