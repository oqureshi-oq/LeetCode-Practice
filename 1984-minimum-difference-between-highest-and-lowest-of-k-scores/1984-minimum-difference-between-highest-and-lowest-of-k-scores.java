class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums == null || k <= 0 || k > nums.length)
            return 0; 
        
        Arrays.sort(nums);
        
        int diff = Integer.MAX_VALUE; 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            if(right - left + 1 == k){
                diff = Math.min(nums[right] - nums[left], diff); 
                left++; 
            }
        }
        
        return diff; 
    }
}