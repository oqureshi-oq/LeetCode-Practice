class Solution {
    public String reverseWords(String s) {
        if(s == null) return null; 
        
        int startIndex = getStartIndex(s);
        int endIndex = getEndIndex(s);
        
        char[] arr = s.toCharArray(); 
        
        reverse(arr, startIndex, endIndex);
        reverseWords(arr, startIndex, endIndex); 
        return cleanSpaces(arr, startIndex, endIndex); 
    }
    
    public int getStartIndex(String s){
        int i = 0; 
        while(i < s.length() && s.charAt(i) == ' ')
            i++;    
        return i;
    }
    
    public int getEndIndex(String s){
        int i = s.length()-1; 
        while(i >= 0 && s.charAt(i) == ' ')
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
        int i = start; 
        
        while(i <= end){
            while(i <= end && arr[i] == ' ')
                i++; 
            int j = i; 
            
            while(j <= end && arr[j] != ' ')
                j++; 
            
            reverse(arr, i, j-1);
            
            i = j; 
        }
    }
    
    public String cleanSpaces(char[] arr, int start, int end){
        StringBuilder str = new StringBuilder(); 
        int i = start; 
        while(i <= end){
            while(i <= end && arr[i] != ' ')
                str.append(arr[i++]); 
            str.append(' '); 
            while(i <= end && arr[i] == ' ')
                i++; 
        }
        
        return str.toString().substring(0, str.length()-1); 
    }
}