class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null;
        
        int write = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0)
                swap(nums, write++, i);
        }
        
        return nums; 
    }
    
    public void swap(int[] nums, int i, int j){
        if(nums == null || i < 0 || j < 0 || i >= nums.length || j >= nums.length)
            return;
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}