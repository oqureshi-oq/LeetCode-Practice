class Solution {
    public void duplicateZeros(int[] arr) {
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