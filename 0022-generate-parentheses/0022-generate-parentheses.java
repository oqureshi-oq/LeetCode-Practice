class Solution {
    List<String> list; 
    
    public List<String> generateParenthesis(int n) {
        if(n <= 0)
            return new ArrayList(); 
        
        list = new ArrayList(); 
        generateParenthesis(n, 0, 0, new StringBuilder()); 
        return list; 
    }
    
    public void generateParenthesis(int n, int open, int close, StringBuilder sb){
        if(n == close){
            list.add(sb.toString());
            return; 
        }
        
        if(open < n){
            sb.append('(');
            generateParenthesis(n, open+1, close, sb); 
            sb.deleteCharAt(sb.length()-1); 
        }
        
        if(open > close){
            sb.append(')');
            generateParenthesis(n, open, close+1, sb); 
            sb.deleteCharAt(sb.length()-1); 
        }
    }
}