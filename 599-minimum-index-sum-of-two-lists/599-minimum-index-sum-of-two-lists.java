class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null) return null; 
        
        List<String> ans = new ArrayList(); 
        
        for(int sum = 0; sum < list1.length + list2.length - 1; sum++){
            for(int i = 0; i <= sum; i++){
                if(i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum-i]))
                    ans.add(list1[i]); 
            }
            
            if(ans.size() > 0)
                return ans.toArray(new String[ans.size()]);  
        }
        
        return null; 
    }
}