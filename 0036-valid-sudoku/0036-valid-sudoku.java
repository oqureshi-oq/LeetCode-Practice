class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9)
            return false; 
        
        Set<String> seen = new HashSet(); 
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                
                int square = 3 * (i/3) + j/3; 
                if(!seen.add(board[i][j] + " in row " + i) ||
                   !seen.add(board[i][j] + " in col " + j) ||
                   !seen.add(board[i][j] + " in square " + square))
                    return false; 
            }
        }
        
        return true; 
    }
}