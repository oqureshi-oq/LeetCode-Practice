class Solution {
    public int minSwaps(String s) {
        if(s == null)
            return -1;
        
        Deque<Character> stack = new ArrayDeque(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop(); 
            else
                stack.push(c); 
        }
        
        return ((stack.size() / 2) + 1) /2;
        //System.out.println(stack.size()); 
        //return 0;
    }
}

// ][ -> []

// ]][[ - > [][]

// ]]][[[ -> []][[] -> [][][]
// ]]]][[[[ -> []]][[[]


//]]]]][]][[]]