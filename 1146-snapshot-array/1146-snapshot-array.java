class SnapshotArray {
    
    private TreeMap<Integer, Integer>[] arr; //key is snapID
    int snapid; 

    public SnapshotArray(int length) {
        arr = new TreeMap[length]; 
        snapid = 0;
    }
    
    public void set(int index, int val) {   
        if(arr[index] == null){
            arr[index] = new TreeMap();
            arr[index].put(0, 0); 
        }
        
        arr[index].put(snapid, val); 
    }
    
    public int snap() {
        snapid++; 
        return snapid-1; 
    }
    
    public int get(int index, int snap_id) {
        if(arr[index] == null){
            arr[index] = new TreeMap();
            arr[index].put(0, 0); 
        } 
        
        return arr[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */