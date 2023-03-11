class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null)
            return null; 
        
        int m = mat.length; 
        int n = mat[0].length; 
        int[] ans = new int[m*n]; 
        int row = 0;
        int col = 0;
        boolean goingUp = true; 
        int i = 0; 
        
        
        while(i < m*n){
            ans[i++] = mat[row][col];
            
            if(goingUp){
                if(row-1 >= 0 && col+1 < n){
                    row--;
                    col++;
                } else { 
                    goingUp = false; 
                    
                    if(col+1 < n)
                        col++;
                    else
                        row++; 
                }
            } else{
                if(row+1 < m && col-1 >= 0){
                    row++;
                    col--; 
                } else {
                    goingUp = true; 
                    
                    if(row+1 < m)
                        row++;
                    else
                        col++; 
                }
            }
        }
        
        return ans; 
    }
}