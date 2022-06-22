class Solution {
    public void duplicateZeros(int[] arr){
        if(arr == null) return;
        Queue<Integer> q = new LinkedList();
        
        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
            if(arr[i] == 0)
                q.add(arr[i]);
            
            arr[i] = q.poll(); 
        }
    }
//     public void duplicateZeros(int[] arr) {
//         if(arr == null) return;
        
//         int zeroCount = getZeroCount(arr);
//         int write = arr.length + zeroCount - 1;
//         int read = arr.length - 1;
        
//         while(read >= 0){
//             if(write < arr.length)
//                 arr[write] = arr[read];
            
//             write--; 
            
//             if(arr[read] == 0){
//                 if(write < arr.length)
//                     arr[write] = 0;
//                 write--; 
//             }
            
//             read--; 
//         }
//     }
    
//     public int getZeroCount(int[] arr){
//         if(arr == null) return -1;
        
//         int zeroCount = 0;
        
//         for(int n: arr){
//             if(n == 0)
//                 zeroCount++;
//         }
        
//         return zeroCount; 
//     }
}