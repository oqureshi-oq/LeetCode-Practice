class Solution {
    public int minDeletions(String s) {
        if(s == null)
            return 0;
        
        int[] freqMap = new int[26];
        int[] buckets = new int[s.length()+1];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freqMap[c - 'a']++; 
        }
        
        for(int n: freqMap){ 
            if (n > 0)
                buckets[n]++; 
        }
        
        int count = 0; 
        
        
        for(int i = buckets.length-1; i > 0; i--){
            while(buckets[i] > 1){
                buckets[i]--; 
                count++; 
                if (i > 0)
                    buckets[i-1]++; 
            }
        }
        
        return count; 
    }
}
