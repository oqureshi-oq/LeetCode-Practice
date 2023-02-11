class Solution {
    List<String> list; 
    int n; 
    
    public List<String> generateParenthesis(int n) {
        list = new ArrayList(); 
        this.n = n; 
        generateParenthesis(0, 0, new StringBuilder());
        return list; 
    }
    
    private void generateParenthesis(int open, int close, StringBuilder sb){
        if(close == n){
            list.add(sb.toString());
            return; 
        }
        
        if(open < n){
            sb.append('(');
            generateParenthesis(open + 1, close, sb);
            sb.deleteCharAt(sb.length()-1); 
        }
        
        if(open > close){
            sb.append(')');
            generateParenthesis(open, close + 1, sb);
            sb.deleteCharAt(sb.length()-1); 
        }
    }
}