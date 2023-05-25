class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels == null || stones == null)
            return 0; 
        
        Set<Character> jSet = new HashSet();
        for(int i = 0; i < jewels.length(); i++){
            jSet.add(jewels.charAt(i));
        }
        
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jSet.contains(stones.charAt(i)))
                count++;
        }
        
        return count; 
    }
}