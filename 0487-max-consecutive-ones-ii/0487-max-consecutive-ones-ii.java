class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int k = 1;
        int right = 0;
        int left = 0;
        
        while(right < nums.length){
            if(nums[right++] == 0)
                k--;
            
            if(k < 0 && nums[left++] == 0)
                k++;
        }
        
        return right - left; 
    }
}