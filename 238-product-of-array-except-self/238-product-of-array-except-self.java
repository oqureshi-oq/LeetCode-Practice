class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null)
            return new int[0];
        
        int[] ans = new int[nums.length]; 
        int right = 1; 
        int left = 1; 
        
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                right *= 1; 
            else
                right *= nums[i-1]; 
            
            ans[i] = right; 
        } 

        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1)
                left *= 1;  
            else
                left *= nums[i+1];  
            
            ans[i] *= left; 
        }
        
        return ans; 
    }
}