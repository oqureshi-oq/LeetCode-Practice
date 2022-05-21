class Solution {
    public String reverseWords(String s) {
        if(s == null) return null; 
        
        char[] arr = s.toCharArray(); 
        
        int start = 0; 
        int end = 0;
        
        while(end < arr.length){
            while(end < arr.length && arr[end] != ' ') 
                end++; 
            
            reverse(arr, start, end-1); 
            
            end++; 
            start = end; 
        }
        
        return new String(arr); 
    }
    
    public void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++;
            end--; 
        }
    }
}