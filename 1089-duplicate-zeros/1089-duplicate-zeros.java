class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr == null) return; 
        
        int read = 0; 
        int count = 0;
        
        while(count < arr.length){
            count++; 
            if(arr[read] == 0)
                count++; 
            read++; 
        }
        
        read--;
        int write = arr.length - 1; 
        
        if(count > arr.length){
            arr[write--] = arr[read--]; 
        }
        
        while(read >= 0){
            arr[write--] = arr[read];
            if(arr[read] == 0)
                arr[write--] = 0;
            read--; 
        }
    }
}