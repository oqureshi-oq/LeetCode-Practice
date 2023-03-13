class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return ""; 
        
        char[] arr = s.toCharArray(); 
        int left = 0;
        int right = 0;
        
        while(right < arr.length){
            while(right < arr.length && arr[right] == ' ')
                right++;
            
            left = right; 
            
            while(right < arr.length && arr[right] != ' ')
                right++; 
            
            reverse(arr, left, right-1);
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