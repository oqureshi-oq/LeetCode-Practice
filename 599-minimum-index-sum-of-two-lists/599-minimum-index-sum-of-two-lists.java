class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null || list1.length == 0 || list2.length == 0)
            return new String[0]; 
        
        Map<String, Integer> list1Map = new HashMap(); 
        
        for(int i = 0; i < list1.length; i++){
            if(!list1Map.containsKey(list1[i]))
                list1Map.put(list1[i], i); 
        }
        
        int min = list1.length + list2.length; 
        List<String> list = new ArrayList(); 
        
        for(int i = 0; i < list2.length; i++){
            if(list1Map.containsKey(list2[i])){
                int sum = i + list1Map.get(list2[i]); 
                
                if(sum < min){
                    list.clear();
                    min = sum; 
                }
                
                if(sum == min)
                    list.add(list2[i]); 
            }
        }
        
        if(min == list1.length + list2.length)
            return new String[0]; 
        
        String[] ans = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i); 
        }
        
        return ans; 
    }
}