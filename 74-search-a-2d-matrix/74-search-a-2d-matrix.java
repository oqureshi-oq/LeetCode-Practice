class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null)
            return false;
        
        int leftRow = 0;
        int rightRow = matrix.length - 1; 
        
        while(leftRow <= rightRow){
            int midRow = leftRow + (rightRow - leftRow)/2;
            
            if(target < matrix[midRow][0]){
                rightRow = midRow-1;
            } else if(matrix[midRow][matrix[midRow].length-1] < target){
                leftRow = midRow + 1; 
            } else {
                int leftCol = 0;
                int rightCol = matrix[midRow].length-1; 
                
                while(leftCol <= rightCol){
                    int midCol = leftCol + (rightCol - leftCol)/2;
                    
                    if(matrix[midRow][midCol] == target)
                        return true;
                    else if(matrix[midRow][midCol] < target)
                        leftCol = midCol+1;
                    else
                        rightCol = midCol-1;
                }
                
                break; 
            }
        }
        
        return false; 
    }
}