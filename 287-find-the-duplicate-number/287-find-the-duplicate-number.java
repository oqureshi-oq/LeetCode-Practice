class Solution {
    public int findDuplicate(int[] nums) {
        int i; 
        
        for(i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i])-1] > 0)
                nums[Math.abs(nums[i])-1] *= -1; 
            else
                break; 
        }
        
        int j = i;
        
        while(i >= 0){
            nums[i] = Math.abs(nums[i]); 
            i--; 
        }
        
        return nums[j]; 
    }
}