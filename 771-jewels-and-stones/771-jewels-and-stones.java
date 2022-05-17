class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels == null) return -1;
        if(stones == null) return 0; 
        
        Set<Character> jewelSet = new HashSet(); 
        int count = 0; 
        
        for(int i = 0; i < jewels.length(); i++){
            char c = jewels.charAt(i); 
            jewelSet.add(c);
        }
        
        for(int i = 0; i < stones.length(); i++){
            char c = stones.charAt(i); 
            if(jewelSet.contains(c))
                count++;
        }
        
        return count; 
    }
}