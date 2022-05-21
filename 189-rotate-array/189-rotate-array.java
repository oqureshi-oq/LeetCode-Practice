class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null) return;
        
        int[] ans = new int[nums.length]; 
        
        for(int i = 0; i < nums.length; i++){
            ans[(i + k) % nums.length] = nums[i]; 
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = ans[i]; 
        }
    }
}