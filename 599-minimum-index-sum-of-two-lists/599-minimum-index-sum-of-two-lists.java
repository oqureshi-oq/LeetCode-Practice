class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null) return null; 
        
        Map<Integer, List<String>> map = new HashMap(); 
        int min = list1.length + list2.length; 
        
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(!map.containsKey(i+j))
                        map.put(i+j, new ArrayList());
                    map.get(i+j).add(list1[i]); 
                    min = Math.min(min, i+j); 
                }
            }
        }
        
        return map.get(min).toArray(new String[map.get(min).size()]); 
    }
}