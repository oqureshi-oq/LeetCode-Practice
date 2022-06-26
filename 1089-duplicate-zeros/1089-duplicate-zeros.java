class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr == null) return;
        
        int count = 0;
        int read = 0;
        int write = arr.length - 1; 
        
        while(count < arr.length){
            count++;
            if(arr[read] == 0)
                count++;
            read++; 
        }
        
        read--;
        
        if(count > arr.length)
            arr[write--] = arr[read--];
        
        while(read >= 0){
            arr[write--] = arr[read];
            if(arr[read] == 0)
                arr[write--] = 0;
            read--; 
        }
    }
    
    public void duplicateZeros2(int[] arr) {
        if(arr == null) return;
        
        int[] ans = new int[arr.length];
        
        int read = 0;
        int write = 0;
        
        while(write < arr.length){
            ans[write++] = arr[read];
            if(arr[read] == 0 && write < arr.length)
                ans[write++] = arr[read];
            read++; 
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
    
    public void duplicateZeros1(int[] arr) {
        if(arr == null) return;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) continue;
            
            for(int j = arr.length - 2; i <= j; j--){
                arr[j+1] = arr[j];
            }
            
            i++; 
        }
    }
}