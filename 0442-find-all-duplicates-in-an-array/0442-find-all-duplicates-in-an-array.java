class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums == null)
            return null; 
        
        List<Integer> list = new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i])-1] < 0)
                list.add(Math.abs(nums[i]));
            else
                nums[Math.abs(nums[i])-1] *= -1;
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        
        return list; 
    }
}