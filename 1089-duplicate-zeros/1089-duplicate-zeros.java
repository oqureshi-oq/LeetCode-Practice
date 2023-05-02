class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr == null)
            return;
        
        int zeroCount = 0;
        for(int n: arr){
            if(n == 0)
                zeroCount++; 
        }
        
        int write = arr.length + zeroCount - 1;
        int read = arr.length - 1; 
        
        while(read >= 0){
            if(write < arr.length)
                arr[write] = arr[read];
            
            write--; 
            
            if(arr[read] == 0){
                if(write < arr.length)
                    arr[write] = 0; 
                write--; 
            }
            
            read--; 
        }
    }
}