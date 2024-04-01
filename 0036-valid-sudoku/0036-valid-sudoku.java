class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false; 
        
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.')
                    continue; 
                
                int number = board[i][j] - '0' - 1;
                int boxNumber = 3 * (i / 3) + (j/3);
                
                if(row[i][number] || col[j][number] || box[boxNumber][number])
                    return false; 
                
                row[i][number] = true;
                col[j][number] = true;
                box[boxNumber][number] = true; 
            }
        }
        
        return true; 
    }
}