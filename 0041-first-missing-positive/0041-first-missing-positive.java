class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 1;
                
        for(int i = 0; i < nums.length; i++){
            if(1 <= nums[i] && nums[i] <= nums.length && i+1 != nums.length+1 && i+1 != nums[i]){
                int temp1 = nums[i];
                int temp2 = nums[nums[i]-1];  
                swap(nums, i, nums[i]-1);
                if(temp1 != temp2)
                    i--; 
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i+1 != nums[i])
                return i+1; 
        }
        
        return nums.length+1; 
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}

// [3, 4, -1, 1]
// [-1, 4, 3, 1]
// [-1, 1, 3 ,4]
// [1, -1, 3, 4]
