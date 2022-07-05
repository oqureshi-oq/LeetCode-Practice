class Solution {
    public String reverseWords(String s) {
        if(s == null) return new String();
        
        char[] arr = s.toCharArray(); 
    
        reverse(arr, 0, arr.length-1);
        reverseWords(arr); 
        return cleanSpaces(arr);
    }
    
    public String cleanSpaces(char[] arr){
        int i = 0; 
        StringBuilder str = new StringBuilder(); 
    
        while(i < arr.length){
            while(i < arr.length && arr[i] == ' ')
                i++;
             
            int j = i; 
            
            while(j < arr.length && arr[j] != ' ')
                str.append(arr[j++]); 
            
            str.append(' '); 
            
            i = j; 
            while(i < arr.length && arr[i] == ' ')
                i++;
        }
        
        return str.toString().substring(0, str.length()-1); 
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
    
    public void reverseWords(char[] arr){
        int left = 0; 
        int right = 0; 
        
        while(left < arr.length){
            while(left < arr.length && arr[left] == ' ')
                left++; 
            
            right = left; 
            
            while(right < arr.length && arr[right] != ' ')
                right++; 
            
            reverse(arr, left, right-1); 
            
            left = right; 
        }
    }
}