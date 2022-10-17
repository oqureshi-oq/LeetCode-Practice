class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null)
            return null; 
        
        int m = mat.length; 
        int n = mat[0].length; 
        int[] ans = new int[m*n]; 
        boolean goingUp = true; 
        int row = 0;
        int col = 0; 
        
        for(int i = 0; i < m*n; i++){
            ans[i] = mat[row][col]; 
            
            if(goingUp){
                if(row-1 >= 0 && col+1 < n){
                    row--;
                    col++;
                } else if(row-1 < 0 && col+1 < n){
                    col++; 
                    goingUp = false; 
                } else{
                    row++; 
                    goingUp = false; 
                }
            } else {
                if(row+1 < m && col-1 >= 0){
                    row++; 
                    col--; 
                } else if(col-1 < 0 && row+1 < m){
                    row++; 
                    goingUp = true; 
                } else {
                    col++;
                    goingUp = true; 
                }
            }
        }
        
        return ans; 
    }
}