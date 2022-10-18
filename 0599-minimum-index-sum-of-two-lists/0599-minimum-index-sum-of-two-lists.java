class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1 == null || list2 == null)
            return new String[0]; 
        
        Map<String, Integer> map = new HashMap(); 
        List<String> ans = new ArrayList();  
        int minIndexSum = list1.length + list2.length; 
        
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i); 
        }
        
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int indexSum = i + map.get(list2[i]); 
                
                if(indexSum < minIndexSum){
                    ans.clear();
                    minIndexSum = i + map.get(list2[i]); 
                }
                
                if(indexSum <= minIndexSum){
                    ans.add(list2[i]); 
                }
            }
        }
        
        if(minIndexSum == list1.length + list2.length)
            return new String[0];
        
        String[] answer = new String[ans.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i); 
        }
        
        return answer; 
    }
}