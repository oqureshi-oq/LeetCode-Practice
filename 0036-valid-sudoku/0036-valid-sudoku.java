class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false;
        
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9]; 
        boolean[][] boxes = new boolean[9][9]; 
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue; 
                
                int index = board[i][j] - '1';  

                if(rows[i][index] || cols[j][index] || boxes[i/3 * 3 + j/3][index])
                    return false; 
                
                rows[i][index] = true;
                cols[j][index] = true; 
                boxes[i/3 * 3 + j/3][index] = true; 
            }
        }
        
        return true; 
    }
}