class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null)
            return 0;
        
        int write = 0;
        
        for(int n: nums){
            if(n != val)
                nums[write++] = n;
        }
        
        return write; 
    }
}