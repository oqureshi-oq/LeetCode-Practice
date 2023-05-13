class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null)
            return;
        
        k %= nums.length; 
        
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }
    
    public void rotate(int[] arr, int start, int end){
        if(arr == null || start < 0 || end >= arr.length)
            return;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--; 
        }
    }
}