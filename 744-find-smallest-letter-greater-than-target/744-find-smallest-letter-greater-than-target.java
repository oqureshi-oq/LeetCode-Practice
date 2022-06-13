class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters == null) return 'A';
        
        int left = 0;
        int right = letters.length - 1;
        
        while(left < right){
            int mid = left + ((right - left) >> 1); 
            
            if(letters[mid] <= target)
                left = mid+1;
            else
                right = mid; 
        }
        
        return letters[left] > target ? letters[left]: letters[0]; 
    }
}