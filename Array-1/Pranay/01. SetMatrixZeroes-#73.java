class Solution {
    public void setZeroes(int[][] matrix) { 
        ArrayList<ArrayList<Integer>> zeroes = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){         
                if(matrix[i][j]==0){
                    zeroes.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        for(int i =0 ; i< zeroes.size();i++){
            setRowZero(matrix, zeroes.get(i).get(0));
            setColZero(matrix, zeroes.get(i).get(1));
        }
    }
    public static void setRowZero(int[][]m, int a){
        for(int i=0;i<m[0].length;i++){
            m[a][i] =0;
        }
    }
    public static void setColZero(int[][]m, int a){
        for(int i=0;i<m.length;i++){
            m[i][a] =0;
        }
    }
}
