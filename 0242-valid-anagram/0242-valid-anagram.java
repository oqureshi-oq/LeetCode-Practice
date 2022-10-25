class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        Map<Character, Integer> mapS = new HashMap(); 
        Map<Character, Integer> mapT = new HashMap(); 
        
        for(int i = 0; i < s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1); 
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1); 
        }
        
        for(Character c: mapS.keySet()){
            if(!mapS.get(c).equals(mapT.getOrDefault(c, 0))){
                System.out.println(mapT.getOrDefault(c, 0));
                System.out.println(mapS.get(c)); 
                return false; 
            }
        }
        
        return true; 
    }
}