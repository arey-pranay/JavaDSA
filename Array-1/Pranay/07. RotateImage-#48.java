class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}

// class Solution {
//     public void rotate(int[][] matrix) {
//         // transpose the matrix, diagonally
//         for(int i=0;i<matrix.length;i++){
//             for(int j=i;j<matrix[0].length;j++){
//                 swapMat(matrix,i,j);
//             }
//         }
//         for(int[] a : matrix) revRow(a);
//     }
//     public void swapMat (int[][] mat, int i, int j){
//         int temp = mat[i][j];
//         mat[i][j] = mat[j][i];
//         mat[j][i] = temp;
//     }
//     public void revRow (int[] row){
//         int i=0;
//         int j= row.length-1;
//         while(i<=j){
//             swap(row,i,j);
//             i++;
//             j--;
//         }
//     }
//     public void swap (int[] arr, int i, int j){
//         int temp  = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
