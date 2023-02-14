class Solution {
    public void sortColors(int[] nums) {
        if(nums == null)
            return;
        
        int length = nums.length; 
        int left = 0;
        int right = length-1; 
        
        for(int i = 0; i < length; i++){
            if(nums[i] == 0){
                swap(nums, left, i);
                left++; 
            } else if(nums[i] == 2){
                swap(nums, right, i); 
                right--; 
                length--; 
                i--; 
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}