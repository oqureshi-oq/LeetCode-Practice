class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false; 
        
        Set<String> set = new HashSet(); 
        
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.')
                    continue; 
                
                if(!set.add("row:"+row+",value:"+board[row][col]) ||
                   !set.add("col:"+col+",value:"+board[row][col]) ||
                   !set.add("boxrow:"+row/3+",boxcol:"+col/3+",value:"+board[row][col]))
                    return false; 
            }
        }
        
        return true; 
    }
}