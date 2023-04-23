class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null)
            return new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] *= -1; 
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1);
            else
                nums[i] *= -1;
        }
        
        return list; 
    }
}