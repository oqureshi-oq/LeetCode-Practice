class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return new int[0];
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length]; 
        int[] ans = new int[nums.length]; 
        
        for(int i = 0, j = nums.length-1; i < nums.length; i++, j--){
            if(i == 0)
                left[i] = 1; 
            else
                left[i] = left[i-1] * nums[i-1]; 
            
            if(j == nums.length-1)
                right[j] = 1;
            else
                right[j] = right[j+1] * nums[j+1]; 
        }
        
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i]; 
        }
        
        return ans; 
    }
}