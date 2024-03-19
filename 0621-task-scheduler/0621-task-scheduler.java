class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] letters = new int[26];
        int max = 0;
        
        for(char c: tasks){
            letters[c-'A']++; 
            max = Math.max(max, letters[c-'A']);
        }
        
        int count = (max-1) * (n+1); 
        
        for(int c: letters){
            if(c == max)
                count++; 
        }
        
        return Math.max(tasks.length, count);  
    }
}

// 2A
// 2B,
// 1C,
// 1D

// A, B, A, B, C, D
