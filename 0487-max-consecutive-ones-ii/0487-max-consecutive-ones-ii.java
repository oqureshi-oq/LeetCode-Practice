class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int max = 0;
        int k = 1; 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            while(nums[right] == 0 && k == 0){
                if(nums[left++] == 0)
                    k++; 
            }
            
            if(nums[right] == 0)
                k--; 
            
            max = Math.max(max, right - left + 1); 
        }
        
        return max; 
    }
}