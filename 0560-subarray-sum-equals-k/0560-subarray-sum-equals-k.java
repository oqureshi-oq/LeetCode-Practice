class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null)
            return 0;
        
        int prefixSum = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap();
        map.put(prefixSum, 1);
        
        for(int n: nums){
            prefixSum += n;
            count += map.getOrDefault(prefixSum-k,0);
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
}
        
        return count;
    }
}