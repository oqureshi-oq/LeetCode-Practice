class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters == null) return 0; 
        
        int left = 0;
        int right = letters.length - 1;
        
        while(left < right){
            int mid = left + ((right - left) >> 1);
            
            if(target < letters[mid])
                right = mid;
            else
                left = mid+1;
        }
    
        return letters[left] <= target ? letters[0]: letters[left]; 
    }
}