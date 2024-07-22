class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr == null || arr.length < 3)
            return false; 
        
        int left = 0;
        while(left+1 < arr.length-1 && arr[left] < arr[left+1])
            left++;
        
        int right = arr.length-1;
        while(0 < right-1 && arr[right-1] > arr[right])
            right--; 
        
        return left == right; 
    }
}