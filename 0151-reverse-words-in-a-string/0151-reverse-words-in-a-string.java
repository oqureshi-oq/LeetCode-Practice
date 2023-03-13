class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return "";
        
        char[] arr = s.toCharArray(); 
        
        reverse(arr, 0, arr.length - 1); 
        
        int read = 0; 
        int write = 0;
        
        while(read < arr.length){
            while(read < arr.length && arr[read] == ' ')
                read++; 
            
            if(write > 0 && read < arr.length)
                arr[write++] = ' '; 
            
            int begin = write; 
            
            while(read < arr.length && arr[read] != ' ')
                arr[write++] = arr[read++]; 
            
            reverse(arr, begin, write-1); 
        }
        
        return new String(arr, 0, write); 
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