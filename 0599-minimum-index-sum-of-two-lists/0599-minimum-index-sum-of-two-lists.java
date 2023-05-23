class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null)
            return null; 
        
        Map<String, Integer> map1 = new HashMap(); 
        Map<Integer, List<String>> map2 = new HashMap();
        int min = list1.length + list2.length; 
        
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }
        
        for(int i = 0; i < list2.length; i++){
            if(map1.containsKey(list2[i])){
                int count = map1.get(list2[i]) + i;
                min = Math.min(count, min); 
                
                if(!map2.containsKey(count))
                    map2.put(count, new ArrayList());
            
                map2.get(count).add(list2[i]);
            }
        }
        
        String[] ans = new String[map2.get(min).size()];
        for(int i = 0; i < map2.get(min).size(); i++){
            ans[i] = map2.get(min).get(i);
        }
        
        return ans; 
    }
}