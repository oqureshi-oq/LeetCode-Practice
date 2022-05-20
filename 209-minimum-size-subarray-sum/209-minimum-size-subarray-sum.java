class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null) return 0; 
        
        int min = nums.length + 1;
        
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum >= target){
                    min = Math.min(min, j - i + 1); 
                    break;
                }
            }
        }
        
        return min == nums.length+1 ? 0: min; 
//         if(nums == null) return 0; 
        
//         int min = nums.length+1; 
        
//         for(int left = 0, right = 0; right < nums.length; right++){
//             target -= nums[right]; 
            
//             while(target <= 0){
//                 min = Math.min(min, right-left+1); 
//                 target += nums[left++]; 
//             }
//         }
        
//         return min == nums.length+1 ? 0: min; 
    }
}