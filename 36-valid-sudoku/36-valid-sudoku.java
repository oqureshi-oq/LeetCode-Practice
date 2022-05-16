class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9) return false; 
        
        Set<String> seen = new HashSet(); 
        
        for(int row = 0; row < board.length; row++){
            if(board[row].length != 9) return false; 
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.') continue; 
                
                char n = board[row][col]; 
            
                if(!seen.add(n + " in row " + row) || 
                   !seen.add(n + " in col " + col) ||
                   !seen.add(n + " in square "+ row/3 + "-" + col/3))
                    return false;  
            }
        }
        
        return true; 
    }
}
/*
         row/col
0,1,2 / 3 = 0 -> top/left
3,4,5 / 3 = 1 -> middle/middle
6,7,8 / 3 = 2 -> bottom/right
*/