class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels == null || jewels.length() == 0) return 0;
        if(stones == null || stones.length() == 0) return 0; 
        
        Set<Character> jewelTypes = new HashSet(); 
        
        for(int i = 0; i < jewels.length(); i++){
            jewelTypes.add(jewels.charAt(i)); 
        }
        
        int count = 0; 
        
        for(int i = 0; i < stones.length(); i++){
            if(jewelTypes.contains(stones.charAt(i)))
                count++; 
        }
        
        return count; 
    }
}