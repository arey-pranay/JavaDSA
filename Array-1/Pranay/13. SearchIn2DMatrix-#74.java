class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //if there is only one array then apply binarySearch directly on that
        if (matrix.length == 1) {
            if (Arrays.binarySearch(matrix[0], target) >= 0) return true; 
            return false;
        }
        //find the row where the element is present
        int[] rowFound = findRow(matrix, target, 0, matrix.length - 1);
        //apply binarySearch in that row, if found, return true
        if (rowFound != null && Arrays.binarySearch(rowFound, target) >= 0) return true;
        return false;
    }

    public static int[] findRow(int[][] mat, int t, int s, int e) {
        //it takes the matrix, target, start and end
        int cols = mat[0].length;
        if (s > e) return null; // Base case: return null if the search space is exhausted
        //now decide which row to start you search from and end your search at, and apply a binarySearch sorta technique on that
        int mid = s + (e - s) / 2;
        int[] row = mat[mid];
        int temp1 = row[0];
        int temp2 = row[cols - 1];
        if (t >= temp1 && t <= temp2) { // If target is within the range of this row
            return row;
        } else if (t < temp1) { // If target is in the upper half, search in the upper half
            return findRow(mat, t, s, mid - 1);
        } else { // If target is in the lower half, search in the lower half
            return findRow(mat, t, mid + 1, e);
        }
    }
}
