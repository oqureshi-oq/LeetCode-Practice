class Solution {
    List<String> list; 
    
    public List<String> generateParenthesis(int n) {
        list = new ArrayList();
        generateParenthesis(n, 0, 0, new StringBuilder()); 
        return list; 
    }
    
    private void generateParenthesis(int n, int open, int close, StringBuilder sb){
        if(close == n){
            list.add(sb.toString());
            return;
        }
        
        if(open < n){
            sb.append('(');
            generateParenthesis(n, open + 1, close, sb);
            sb.deleteCharAt(sb.length()-1); 
        }
        
        if(open > close){
            sb.append(')');
            generateParenthesis(n, open, close + 1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}