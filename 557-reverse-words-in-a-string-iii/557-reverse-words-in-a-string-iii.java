class Solution {
    public String reverseWords(String s) {
        if(s == null) return new String(); 
        
        char[] arr = s.toCharArray(); 
        
        int i = 0; 
        int j = 0; 
        
        while(i < arr.length){
            while(i < arr.length && arr[i] == ' ')
                i++; 
            
            j = i; 
            
            while(j < arr.length && arr[j] != ' ')
                j++; 
            
            reverse(arr, i, j-1);
            
            i = j; 
        }
        
        return new String(arr); 
    }
    
    public void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp; 
            left++;
            right--; 
        }
    }
}