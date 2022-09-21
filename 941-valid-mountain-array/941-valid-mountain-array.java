class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr == null || arr.length < 3)
            return false; 
        
        int i = 0; 
        while(i+1 < arr.length-1 && arr[i] < arr[i+1])
            i++; 
        
        int j = arr.length - 1; 
        while(0 < j-1 && arr[j-1] > arr[j])
            j--; 
        
        return i == j; 
    }
}