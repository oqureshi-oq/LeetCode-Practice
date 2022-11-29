class Solution {
    private void swap(int[] nums, int i, int j){
        if(nums == null)
            return;
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
    public void sortColors(int[] nums) {
        if(nums == null)
            return;
        
        int left = 0;
        int right = nums.length - 1; 
        int read = 0; 
        
        while(read <= right){
            if(nums[read] == 0){
                swap(nums, left, read);
                left++;
                read++; 
            } else if(nums[read] == 2){
                swap(nums,right, read);
                right--; 
            } else {
                read++; 
            }
        }
    }
}