class Solution {
    public String reverseWords(String s) {
        if(s == null) return null; 
        
        char[] arr = s.toCharArray(); 
        
        //reverse the whole string 
        reverse(arr, 0, arr.length-1); 
        
        //get rid of leading and trailing spaces 
        int start = getStartingIndex(arr); 
        int end = getEndingIndex(arr); 
        
        //reverse each word so that it reads properly
        reverseWords(arr, start, end); 
        
        return cleanedString(arr, start, end); 
    }
    
    public int getStartingIndex(char[] arr){
        int i = 0; 
        while(i < arr.length && arr[i] == ' ')
            i++; 
        return i; 
    }
    
    public int getEndingIndex(char[] arr){
        int i = arr.length-1; 
        while(i >= 0 && arr[i] == ' ')
            i--; 
        return i; 
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
    
    public void reverseWords(char[] arr, int start, int end){
        int left = start; 
        int right = start; 
        while(right <= end){
            while(right <= end && arr[right] != ' ')
                right++; 
            
            reverse(arr, left, right-1); 
            
            while(right <= end && arr[right] == ' ')
                right++; 
            
            left = right; 
        }
    }
    
    public String cleanedString(char[] arr, int start, int end){
        StringBuilder str = new StringBuilder(); 
        
        int i = start; 
        while(i <= end){
            if(arr[i] != ' '){
                str.append(arr[i++]); 
            } else {
                str.append(' ');
                while(i <= end && arr[i] == ' ')
                    i++; 
            }
        }
        
        return str.toString(); 
    }
}