class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null) return -1;
        
        int k = 0;
        for(int n: nums){
            if(n != val)
                nums[k++] = n;
        }
        
        return k; 
    }
}