class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null)
            return;
        
        int write = 0;
        
        for(int n: nums){
            if(n != 0)
                nums[write++] = n;
        }
        
        while(write < nums.length)
            nums[write++] = 0;
    }
}