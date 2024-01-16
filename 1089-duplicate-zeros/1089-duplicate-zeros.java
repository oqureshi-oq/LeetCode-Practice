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
        
        for(int read = arr.length-1; read >= 0; read--){
            if(arr[read] == 0){
                if(write < arr.length)
                    arr[write] = arr[read];
                
                write--; 
                
                if(write < arr.length)
                    arr[write] = arr[read];
                
                write--; 
            } else {
                if(write < arr.length)
                    arr[write] = arr[read]; 
                
                write--; 
            }
        }
    }
}


