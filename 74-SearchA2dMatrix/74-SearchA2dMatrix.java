// Last updated: 6/16/2026, 10:09:25 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++){
            int left = 0, right = matrix[0].length-1;
            
            while (left <= right){
                int mid = (left + right) / 2;
                if (matrix[row][mid]==target) return true;
                else if (matrix[row][mid]<target) left = mid + 1;
                else right = mid - 1; 
            }
        }    
        return false;
    }
    }
