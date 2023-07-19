class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        int k = 0;
        
        for(int n: nums){
            if(k == 0)
                nums[k++] = n;
            else if (n != nums[k-1])
                nums[k++] = n;
        }
        
        return k; 
    }
}