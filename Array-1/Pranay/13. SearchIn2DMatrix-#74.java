class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        if (matrix.length == 1) {
            if (Arrays.binarySearch(matrix[0], target) >= 0) return true;
            return false;
        }
        int[] rowFound = findRow(matrix, target, 0, matrix.length - 1);
        if (rowFound != null && Arrays.binarySearch(rowFound, target) >= 0) return true;
        return false;
    }

    public static int[] findRow(int[][] mat, int t, int s, int e) {
        int cols = mat[0].length;
        if (s > e) return null; // Base case: return null if the search space is exhausted
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
