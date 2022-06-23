class Solution {
    public void duplicateZeros(int[] arr){
        if(arr == null) return;
        
        int count = 0;
        int read = 0;
        while(count < arr.length){
            count++;
            if(arr[read] == 0)
                count++; 
            read++; 
        }
        
        read--; 
        int write = arr.length - 1;
        
        if(count > arr.length)
            arr[write--] = arr[read--];
        
        while(read >= 0){
            arr[write--] = arr[read];
            if(arr[read] == 0)
                arr[write--] = 0;
            read--; 
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