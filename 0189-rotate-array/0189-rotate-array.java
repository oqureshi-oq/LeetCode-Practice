class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null)
            return;
        
        k %= nums.length; 
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1); 
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        int left = start; 
        int right = end; 
        
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp; 
            left++;
            right--; 
        }
    }
}