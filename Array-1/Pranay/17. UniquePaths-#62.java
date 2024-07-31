// class Solution {
//     public int uniquePaths(int m, int n) {
//         long ans = 1;
//         for(int i = m+n-2, j = 1; i >= max(m, n); i--, j++) 
//             ans = (ans * i) / j;
//         return ans;
//     }
// }
// in total you have to take n-1 rights and m-1 down
//     so total steps will n-1+m-1 equal to n+m -2 
//     we can use NCr to know the combination of D and R moves in an N sized combination


// memoization (DP) (Recursion)

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m+1][n+1];
        return func(m,n,memo);
    }
    public int func(int m, int n, int[][] memo){
        if(m==1 || n==1) return 1;
        if(memo[m-1][n] == 0)
            memo[m-1][n] = func(m-1,n,memo);
        if(memo[m][n-1] == 0)
            memo[m][n-1] = func(m,n-1,memo);
        return memo[m-1][n] + memo[m][n-1];
    }
}
