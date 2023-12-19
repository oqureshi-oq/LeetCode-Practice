class Solution {
    public int[][] imageSmoother(int[][] img) {
        if(img == null)
            return null;
        
        int m = img.length; 
        int n = img[0].length; 
        int[][] ans = new int[m][n];
        
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                int sum = img[row][col];
                int count = 1;
                
                if(col-1 >=0){
                    count++;
                    sum += img[row][col-1];
                    
                    if(row-1 >= 0){
                        count++;
                        sum += img[row-1][col-1];
                    }
                    
                    if(row+1 < m){
                        count++;
                        sum += img[row+1][col-1];
                    }
                }
                
                if(col+1 < n){
                    count++;
                    sum += img[row][col+1];
                    
                    if(row-1 >= 0){
                        count++;
                        sum += img[row-1][col+1];
                    }
                    
                    if(row+1 < m){
                        count++;
                        sum += img[row+1][col+1];
                    }
                }
                
                if(row-1 >= 0){
                    count++;
                    sum += img[row-1][col];
                }
                
                if(row+1 < m){
                    count++;
                    sum += img[row+1][col];
                }
                
                ans[row][col] = sum/count; 
            }
        }
        
        return ans; 
    }
}