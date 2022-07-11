class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null) return false; 
        
        Set<String> seen = new HashSet(); 
        
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                char value = board[row][col]; 
                
                if(value == '.') 
                    continue; 
                
                if(!seen.add("row" + row + "v" + value) || 
                   !seen.add("col" + col + "v" + value) ||
                   !seen.add("rowSquare" + row / 3 + "colSquare" + col / 3 + "v" + value))
                    return false; 
            }
        }
        
        return true; 
    }
}