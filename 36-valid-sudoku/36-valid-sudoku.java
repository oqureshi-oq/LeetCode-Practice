class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9) return false; 
        
        Set<String> seen = new HashSet(); 
        
        for(int row = 0; row < board.length; row++){
            if(board[row].length != 9) return false; 
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.') continue; 
                
                char n = board[row][col]; 
            
                if(seen.contains(row+"row"+n) || seen.contains(col+"col"+n)
                  || seen.contains(row/3+":"+col/3+":"+n))
                    return false; 
                
                seen.add(row+"row"+n);
                seen.add(col+"col"+n);
                seen.add(row/3+":"+col/3+":"+n); 
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