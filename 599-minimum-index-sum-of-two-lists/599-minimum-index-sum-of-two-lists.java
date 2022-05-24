class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null) return null; 
        
        Map<String, Integer> map1 = new HashMap(); 
        
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i); 
        }
        
        int min = list1.length + list2.length; 
        Map<Integer, List<String>> map2 = new HashMap(); 
        
        for(int i = 0; i < list2.length; i++){
            if(map1.containsKey(list2[i])){
                int indexSum = map1.get(list2[i]) + i; 
                
                if(!map2.containsKey(indexSum))
                    map2.put(indexSum, new ArrayList()); 
                
                map2.get(indexSum).add(list2[i]);
                
                min = Math.min(min, indexSum); 
            }
        }
        
        if(min == list1.length + list2.length) return null; 
        
        return map2.get(min).toArray(new String[map2.get(min).size()]); 
    }
}