class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr == null || arr.length < 3)
            return false; 
        
        int left = 0;
        while(left < arr.length-2 && arr[left] < arr[left+1])
            left++; 
        
        int right = arr.length - 1;
        while(1 < right && arr[right-1] > arr[right])
            right--;
        
        return left == right; 
    }
}