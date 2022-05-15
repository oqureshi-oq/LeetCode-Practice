class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null) return null; 
        
        Map<String, Integer> map1 = new HashMap(); 
        Map<Integer, List<String>> map3 = new HashMap();
        int min = list1.length + list2.length; 
        
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i); 
        }
        
        for(int i = 0; i < list2.length; i++){
            if(!map1.containsKey(list2[i])) continue;
            
            if(!map3.containsKey(i + map1.get(list2[i])))
                map3.put(i + map1.get(list2[i]), new ArrayList()); 
            
            map3.get(i + map1.get(list2[i])).add(list2[i]); 
            min = Math.min(min, i+map1.get(list2[i])); 
        }
        
        String[] ans = new String[map3.get(min).size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = map3.get(min).get(i); 
        }
        
        return ans;
    }
}