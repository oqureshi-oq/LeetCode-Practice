class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null)
            return new ArrayList(); 
        
        List<List<Integer>> list = new ArrayList(); 
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i-1] == nums[i])
                continue; 
            
            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    while(left < right && nums[left] == nums[left-1])
                        left++;
                    
                    right--;
                    while(left < right && nums[right] == nums[right+1])
                        right--; 
                } else if (sum < 0){
                    left++;
                } else {
                    right--; 
                }
            }
        }
        
        return list; 
    }
}