class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums == null)
            return new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            int j = i;
            while(nums[j] != j+1 && nums[j] != nums[nums[j]-1]){
                int temp = nums[j];
                nums[j] = nums[temp-1];
                nums[temp-1] = temp; 
            }
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1)
                list.add(nums[i]);
        }
        
        return list; 
    }
}


// [4,3,2,7,8,2,3,1]
// [7,3,2,4,8,2,3,1]
// [1,2,3,4,3,2,7,8]
