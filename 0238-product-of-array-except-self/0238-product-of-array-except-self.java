class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null)
            return new int[0];
        
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1); 
        
        int leftProduct = 1; 
        int rightProduct = 1; 
        
        for(int i = 0; i < nums.length; i++){
            ans[i] *= leftProduct; 
            leftProduct *= nums[i]; 
        }
        
        for(int i = nums.length - 1; i >= 0; i--){
            ans[i] *= rightProduct; 
            rightProduct *= nums[i]; 
        }
        
        return ans; 
    }
    
    // [1, 2, 6, ]
}