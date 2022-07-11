class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels == null || stones == null) return -1;
        
        Set<Character> jewelSet = new HashSet(); 
        int count = 0;
        
        for(Character c: jewels.toCharArray()){
            jewelSet.add(c);
        }
        
        for(Character c: stones.toCharArray()){
            if(jewelSet.contains(c))
                count++; 
        }
        
        return count; 
    }
}