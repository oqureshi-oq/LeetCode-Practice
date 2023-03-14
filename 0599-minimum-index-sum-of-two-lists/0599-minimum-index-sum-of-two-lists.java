class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap(); 
        
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        
        Map<Integer, List<String>> map2 = new HashMap(); 
        int minSum = list1.length + list2.length; 
        
        for(int i = 0; i < list2.length; i++){
            if(!map.containsKey(list2[i]))
                continue; 
            
            int sum = map.get(list2[i]) + i; 
            
            if(minSum >= sum){
                if(!map2.containsKey(sum))
                    map2.put(sum, new ArrayList());
                
                map2.get(sum).add(list2[i]); 
                
                minSum = sum; 
            } 
        }
        
        String[] ans = new String[map2.get(minSum).size()];
        
        for(int i = 0; i < map2.get(minSum).size(); i++){
            ans[i] = map2.get(minSum).get(i); 
        }
        
        return ans; 
    }
}