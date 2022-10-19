class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false; 
        
        Set<String> seen = new HashSet(); 
        
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                char c = board[row][col]; 
                if(c == '.')
                    continue; 
                
                if(seen.contains("value: " + c + ", row: " + row) ||
                   seen.contains("value: " + c + ", col: " + col) ||
                   seen.contains("value: " + c + ", row: " + (row/3) + ", col: " + (col/3)))
                    return false; 
                
                seen.add("value: " + c + ", row: " + row);
                seen.add("value: " + c + ", col: " + col);
                seen.add("value: " + c + ", row: " + (row/3) + ", col: " + (col/3)); 
            }
        }
        
        return true; 
    }
}